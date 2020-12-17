package cn.net.yzl.customer.dao;

import cn.net.yzl.customer.model.Province;
import org.springframework.stereotype.Component;

/**
 * @author : zhangruisong
 * @date : 2020/12/8 19:02
 * @description:
 */
@Component
public interface ProvinceMapper {

    void saveProvince(Province province);


    Province getProvince();

}
