package cn.jiatp.cloud.service;

import cn.jiatp.cloud.dao.OrderDao;
import cn.jiatp.cloud.domain.Order;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: jiatp
 * @Date:2020/4/422:29
 * @ClassName: OrderServiceImpl
 * @Description:
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;

    @Override
    @GlobalTransactional
    public void create(Order order) {
        log.info("----新建订单");
        orderDao.create(order);

        log.info("----调用订单微服务进行库从扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----调用订单微服务进行库从end");

        log.info("----调用账户微服务,做扣减money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----调用账户微服务,做扣减end");

        //修改订单状态
        log.info("----修改订单状态");
        orderDao.update(order.getUserId(),0);
        log.info("----修改订单结束");

        log.info("----下单结束了。。。。。》》");

    }

}
