package cn.net.yzl.customer.service;

import cn.net.yzl.customer.model.CityT;
import com.github.pagehelper.PageInfo;

import java.util.Map;
import java.util.Optional;


public interface CityTService {
    PageInfo<CityT> findPage(Map<String, Object> params);//int page, int pageSize

    Optional<CityT> getById(Integer id);

    Integer insert(CityT city);
}
