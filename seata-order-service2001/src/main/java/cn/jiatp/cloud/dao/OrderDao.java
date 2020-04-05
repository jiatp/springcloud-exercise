package cn.jiatp.cloud.dao;

import cn.jiatp.cloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: jiatp
 * @Date:2020/4/422:15
 * @ClassName: OrderDao
 * @Description:
 */
@Mapper
public interface OrderDao {

    //new order
    void create(Order order);

    //updata
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
