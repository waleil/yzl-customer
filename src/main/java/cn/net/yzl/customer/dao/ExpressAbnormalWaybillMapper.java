package cn.net.yzl.customer.dao;

import cn.net.yzl.customer.model.ExpressAbnormalWaybill;

public interface ExpressAbnormalWaybillMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(ExpressAbnormalWaybill record);

    int insertSelective(ExpressAbnormalWaybill record);

    ExpressAbnormalWaybill selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(ExpressAbnormalWaybill record);

    int updateByPrimaryKey(ExpressAbnormalWaybill record);
}