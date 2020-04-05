package cn.jiatp.springcloud;

import cn.jiatp.myRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: jiatp
 * @Date:2020/3/2714:10
 * @ClassName: OrderMain80
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
//启用RibbonClient客户端，表示要访问CLOUD-PAYMENT-SERVICE，使用自定义的IRule配置
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE" ,configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
