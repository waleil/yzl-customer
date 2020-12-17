package cn.net.yzl.customer.dao.mogo;

import cn.net.yzl.customer.model.mogo.DemoMongo;
import org.springframework.stereotype.Repository;

/**
 * @Author jingweitao
 **/
@Repository
public class DemoMogoDAO extends MongoBaseDao<DemoMongo> {
    /**
     * 反射获取泛型类型
     */
    @Override
    protected Class<DemoMongo> getEntityClass() {
        return DemoMongo.class;
    }
}
