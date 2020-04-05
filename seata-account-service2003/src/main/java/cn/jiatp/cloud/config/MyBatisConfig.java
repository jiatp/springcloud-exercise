package cn.jiatp.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jiatp
 * @Date:2020/4/511:15
 * @ClassName: MyBatisConfig
 * @Description:
 */
@Configuration
@MapperScan(value = {"cn.jiatp.cloud.dao"})
public class MyBatisConfig {
}
