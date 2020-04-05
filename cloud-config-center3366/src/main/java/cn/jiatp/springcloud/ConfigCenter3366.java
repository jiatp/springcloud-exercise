package cn.jiatp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: jiatp
 * @Date:2020/4/123:15
 * @ClassName: ConfigCenter3366
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigCenter3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3366.class,args);
    }
}
