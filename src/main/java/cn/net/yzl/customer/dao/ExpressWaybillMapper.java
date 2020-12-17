package cn.net.yzl.customer.dao;

import cn.net.yzl.customer.model.ExpressWaybill;

public interface ExpressWaybillMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(ExpressWaybill record);

    int insertSelective(ExpressWaybill record);

    ExpressWaybill selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(ExpressWaybill record);

    int updateByPrimaryKey(ExpressWaybill record);
}