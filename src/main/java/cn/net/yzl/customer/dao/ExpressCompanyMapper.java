package cn.net.yzl.customer.dao;

import cn.net.yzl.customer.model.ExpressCompany;

public interface ExpressCompanyMapper {
    int deleteById(Integer id);

    int insert(ExpressCompany record);

    ExpressCompany selectById(Integer id);

    int update(ExpressCompany record);

}