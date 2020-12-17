package cn.net.yzl.customer.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.net.yzl.common.entity.GeneralResult;
import cn.net.yzl.common.enums.ResponseCodeEnums;
import cn.net.yzl.customer.dto.crowdgroup.ListPageParamDTO;
import cn.net.yzl.customer.dto.crowdgroup.UpdateInvalidateParamDTO;
import cn.net.yzl.customer.model.CustomerCrowdGroup;
import cn.net.yzl.customer.service.CustomerCrowdGroupService;
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
@RequestMapping(value = CustomerCrowdGroupController.PATH)
public class CustomerCrowdGroupController {
    public static final String PATH = "crowdgroup/customer";

    @Autowired
    private CustomerCrowdGroupService service;



    @ApiOperation(value="分页查询顾客人群圈选列表")
    @PostMapping("listPage")
    public GeneralResult<PageInfo<CustomerCrowdGroup>> listPage(@RequestBody ListPageParamDTO dto) {
        Map<String, Object> params = new HashMap<>();
        BeanUtil.copyProperties(dto, params);
        PageInfo<CustomerCrowdGroup> result = service.findPage(params);
        return GeneralResult.success(result);
    }

    @ApiOperation(value="删除")
    @PostMapping("deleteById")
    public GeneralResult<Boolean> deleteById(@RequestParam("id")
                                                 @NotBlank(message="顾客人群圈选id不能为空")
                                                 @ApiParam(name="id",value="顾客人群圈选id",required=true)  String id) {
       //这个应该是假删除，需要加个是否删除的状态
        return GeneralResult.success(Boolean.TRUE);
    }

    @ApiOperation(value="失效/启用")
    @PostMapping("invalidate")
    public GeneralResult<Boolean> invalidate(@RequestBody  UpdateInvalidateParamDTO dto) {
        CustomerCrowdGroup g = new CustomerCrowdGroup();
        BeanUtil.copyProperties(dto,g);
        service.update(g);
        return GeneralResult.success(Boolean.TRUE);
    }


    @ApiOperation(value="查询顾客人群圈选详情")
    @PostMapping("getById")
    public GeneralResult<CustomerCrowdGroup> getById(@RequestParam("id")
                                                           @NotBlank(message="顾客人群圈选id不能为空")
                                                           @ApiParam(name="id",value="顾客人群圈选id",required=true)  String id) {
        Optional<CustomerCrowdGroup> byId = service.getById(id);
        CustomerCrowdGroup customerCrowdGroup = byId.orElseThrow(() -> new BizException(ResponseCodeEnums.NO_DATA_CODE));
        return GeneralResult.success(customerCrowdGroup);
    }



    @ApiOperation(value="新增-保存(此方法有待完善)")
    @PostMapping("save")
    public GeneralResult<Boolean> save() {
        return GeneralResult.success(Boolean.TRUE);
    }

    @ApiOperation(value="编辑-保存(此方法有待完善)")
    @PostMapping("update")
    public GeneralResult<Boolean> update() {
        return GeneralResult.success(Boolean.TRUE);
    }

    @ApiOperation(value="预算(此方法有待完善)")
    @PostMapping("budget")
    public GeneralResult<Boolean> budget() {
        return GeneralResult.success(Boolean.TRUE);
    }

}
