package cn.jiatp.cloud.controller;

import cn.jiatp.cloud.domain.CommonResult;
import cn.jiatp.cloud.domain.Order;
import cn.jiatp.cloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiatp
 * @Date:2020/4/422:42
 * @ClassName: OrderController
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功！");
    }
}
