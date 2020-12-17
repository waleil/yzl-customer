package cn.net.yzl.customer.service;

import cn.net.yzl.customer.model.CustomerCrowdGroup;
import com.github.pagehelper.PageInfo;

import java.util.Map;
import java.util.Optional;


public interface CustomerCrowdGroupService {
    PageInfo<CustomerCrowdGroup> findPage(Map<String, Object> params);//int page, int pageSize

    Optional<CustomerCrowdGroup> getById(String id);

    Integer insert(CustomerCrowdGroup vo);

    Integer update(CustomerCrowdGroup vo);
}
