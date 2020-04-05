package cn.jiatp.cloud.config;

/**
 * @Author: jiatp
 * @Date:2020/4/423:34
 * @ClassName: MyBatisConfig
 * @Description:
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = {"cn.jiatp.cloud.dao"})
public class MyBatisConfig {
}