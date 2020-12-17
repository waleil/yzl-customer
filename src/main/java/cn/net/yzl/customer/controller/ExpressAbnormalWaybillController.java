package cn.net.yzl.customer.controller;

import cn.net.yzl.common.entity.GeneralResult;
import cn.net.yzl.customer.dto.express.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping(value = ExpressAbnormalWaybillController.PATH)
public class ExpressAbnormalWaybillController {
    public static final String PATH = "express/abnormalwaybill";

    @ApiOperation(value="查询运单异常列表")
    @PostMapping("list")
    public GeneralResult<List<ExpressAbnormalWaybillResDTO>> list() {
        ExpressAbnormalWaybillResDTO d =  new ExpressAbnormalWaybillResDTO();
        return GeneralResult.success(Collections.singletonList(d));
    }


    @ApiOperation(value="登记")
    @PostMapping("save")
    public GeneralResult<Boolean> save(@RequestBody ExpressAbnormalWaybillSaveDTO dto) {
        return GeneralResult.success(Boolean.TRUE);
    }


}
