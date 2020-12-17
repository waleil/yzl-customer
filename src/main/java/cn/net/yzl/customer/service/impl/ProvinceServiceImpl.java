package cn.net.yzl.customer.service.impl;

import cn.net.yzl.customer.bean.DataSourceSelector;
import cn.net.yzl.customer.bean.DynamicDataSourceEnum;
import cn.net.yzl.customer.dao.ProvinceMapper;
import cn.net.yzl.customer.model.Province;
import cn.net.yzl.customer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : zhangruisong
 * @date : 2020/12/8 19:04
 * @description:
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {


    @Autowired
    ProvinceMapper provinceMapper;

    @Override
    public void saveProvince(Province province) {
            provinceMapper.saveProvince(province);
    }

    @DataSourceSelector(value = DynamicDataSourceEnum.slave)
    @Override
    public Province getProvince() {
        return provinceMapper.getProvince();
    }
}
