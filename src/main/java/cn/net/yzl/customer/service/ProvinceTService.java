package cn.net.yzl.customer.service;

import cn.net.yzl.customer.model.ProvinceT;
import com.github.pagehelper.PageInfo;

import java.util.Map;
import java.util.Optional;


public interface ProvinceTService {
    PageInfo<ProvinceT> findPage(Map<String,Object> params);//int page, int pageSize

    Optional<ProvinceT> getById(Integer id);

    Integer insert(ProvinceT province);
}
