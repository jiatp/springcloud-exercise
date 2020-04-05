package cn.jiatp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: jiatp
 * @Date:2020/3/2823:06
 * @ClassName: ZkOrderMain80
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ZkOrderMain80.class,args);
    }
}
