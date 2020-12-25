package cn.net.yzl.customer.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.net.yzl.common.entity.GeneralResult;
import cn.net.yzl.common.entity.Page;
import cn.net.yzl.customer.dto.crowdgroup.ListPageParamDTO;
import cn.net.yzl.customer.dto.member.MemberSerchConditionDTO;
import cn.net.yzl.customer.model.CustomerCrowdGroup;
import cn.net.yzl.customer.model.Member;
import cn.net.yzl.customer.model.Province;
import cn.net.yzl.customer.service.MemberService;
import cn.net.yzl.customer.service.ProvinceService;
import cn.net.yzl.customer.service.micservice.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangruisong
 * @date : 2020/12/8 19:00
 * @description:
 */
@RestController
@RequestMapping(MemberController.PATH)
public class MemberController {
    public static final String PATH = "customer/member";

    @Autowired
    private MemberService service;


    @ApiOperation(value="分页查询顾客列表")
    @PostMapping("/listPage")
    public GeneralResult<Page<Member>> listPage(@RequestBody MemberSerchConditionDTO dto) {

        Page<Member> result = service.findPage(dto);

        return GeneralResult.success(result);
    }

    @ApiOperation(value="保存会员基本信息")
    @PostMapping("/save")
    public GeneralResult<Boolean> save(@RequestBody Member dto) {
        int result = service.save(dto);
        if(result == 1){
            return GeneralResult.success(Boolean.TRUE);
        }else{
            return GeneralResult.success(Boolean.FALSE);
        }

    }
    @ApiOperation(value="更新会员基本信息")
    @PostMapping("/updateByMemberCart")
    public GeneralResult<Boolean> updateByMemberCart(@RequestBody Member dto) {

        int result = service.updateByMemberCardSelective(dto);
        if(result == 1){
            return GeneralResult.success(Boolean.TRUE);
        }else{
            return GeneralResult.success(Boolean.FALSE);
        }

    }

}
