package cn.jiatp.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: jiatp
 * @Date:2020/3/2714:23
 * @ClassName: ApplicationContextConfig
 * @Description: 配置类
 */
@Configuration
public class ApplicationContextConfig {

   // @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){  //RestTemplate
        return new RestTemplate();
    }
}
