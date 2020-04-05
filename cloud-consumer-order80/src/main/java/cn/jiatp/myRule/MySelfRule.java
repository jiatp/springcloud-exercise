package cn.jiatp.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jiatp
 * @Date:2020/3/2914:07
 * @ClassName: MySelfRule
 * @Description:
 */
@Configuration
public class MySelfRule {


    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机的
    }
}
