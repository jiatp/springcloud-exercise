package cn.jiatp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: jiatp
 * @Date:2020/4/213:57
 * @ClassName: StreamMQ8802
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQ8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQ8802.class,args);
    }
}
