package cn.jiatp.cloud.service;

import cn.jiatp.cloud.domain.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Author: jiatp
 * @Date:2020/4/422:27
 * @ClassName: OrderService
 * @Description:
 */

public interface OrderService {
    //new order
    void create(Order order);
}
