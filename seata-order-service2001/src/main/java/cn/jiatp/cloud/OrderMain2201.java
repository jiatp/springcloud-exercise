package cn.jiatp.cloud;

import cn.jiatp.cloud.domain.Order;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: jiatp
 * @Date:2020/4/422:12
 * @ClassName: OrderMain2201
 * @Description:
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //排除数据源的自动创建
@EnableFeignClients
@EnableDiscoveryClient
public class OrderMain2201 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain2201.class,args);
    }
}
