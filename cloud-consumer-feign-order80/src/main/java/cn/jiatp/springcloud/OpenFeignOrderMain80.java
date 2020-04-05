package cn.jiatp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: jiatp
 * @Date:2020/3/3121:56
 * @ClassName: OpenFeignOrderMain80
 * @Description:
 */

@SpringBootApplication
@EnableFeignClients
public class OpenFeignOrderMain80 {
    public static void main(String[] args) {

        SpringApplication.run(OpenFeignOrderMain80.class,args);
    }
}
