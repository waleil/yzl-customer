package cn.net.yzl.customer.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.net.yzl.common.entity.GeneralResult;
import cn.net.yzl.common.enums.ResponseCodeEnums;
import cn.net.yzl.customer.dto.PageDTO;
import cn.net.yzl.customer.dto.region.CityTSaveDTO;
import cn.net.yzl.customer.model.CityT;
import cn.net.yzl.customer.service.CityTService;
import cn.net.yzl.customer.sys.BizException;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping(value = CityTController.PATH)
public class CityTController {
    public static final String PATH = "region/city";

    @Autowired
    private CityTService service;



    @ApiOperation(value="分页查询城市地区列表")
    @PostMapping("listPage")
    public GeneralResult<PageInfo<CityT>> listPage(@RequestBody PageDTO page) {
        Map<String, Object> params = new HashMap<>();
        BeanUtil.copyProperties(page, params);
        PageInfo<CityT> result = service.findPage(params);
        return GeneralResult.success(result);
    }

    @ApiOperation(value="删除")
    @PostMapping("deleteById")
    public GeneralResult<Boolean> deleteById(@RequestParam("id")
                                                 @NotBlank(message="城市地区id不能为空")
                                                 @ApiParam(name="id",value="城市地区id",required=true)  Integer id) {
       //这个应该是假删除，需要加个是否删除的状态
        return GeneralResult.success(Boolean.TRUE);
    }


    @ApiOperation(value="查询城市地区详情")
    @PostMapping("getById")
    public GeneralResult<CityT> getById(@RequestParam("id")
                                           @NotBlank(message="城市地区id不能为空")
                                           @ApiParam(name="id",value="城市地区id",required=true)  Integer id) {
        Optional<CityT> byId = service.getById(id);
        CityT cityT = byId.orElseThrow(() -> new BizException(ResponseCodeEnums.NO_DATA_CODE));
        return GeneralResult.success(cityT);
    }


    @ApiOperation(value="新增-保存")
    @PostMapping("save")
    public GeneralResult<Boolean> save(@RequestBody CityTSaveDTO dto) {
        CityT p = new CityT();
        BeanUtil.copyProperties(dto,p,true);
        service.insert(p);
        return GeneralResult.success(Boolean.TRUE);
    }

}
