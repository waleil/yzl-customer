package cn.net.yzl.customer.service.impl;

import cn.net.yzl.customer.dao.ProvinceTMapper;
import cn.net.yzl.customer.model.ProvinceT;
import cn.net.yzl.customer.service.ProvinceTService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
public class ProvinceTServiceImpl implements ProvinceTService {


    @Autowired
    private ProvinceTMapper provinceMapper;

    @Override
    public PageInfo<ProvinceT> findPage(Map<String, Object> params) {
        params.computeIfAbsent("currentPage", k -> 1);
        params.computeIfAbsent("pageSize", k -> 10);
        int currentPage = Integer.parseInt(params.get("currentPage").toString());
        int pageSize = Integer.parseInt(params.get("pageSize").toString());
        PageHelper.startPage(currentPage,pageSize );
        List<ProvinceT> provinceList = provinceMapper.selectList(params);
        return  new PageInfo<>(provinceList);
    }

    @Override
    public Optional<ProvinceT> getById(Integer id) {
        return Optional.ofNullable(provinceMapper.selectById(id));
    }

    @Override
    public Integer insert(ProvinceT province) {
        return provinceMapper.insert(province);
    }

}
