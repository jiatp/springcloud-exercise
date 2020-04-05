package cn.jiatp.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jiatp
 * @Date:2020/4/422:52
 * @ClassName: MybatisConfig
 * @Description:
 */
@MapperScan(value = {"cn.jiatp.cloud.dao"})
@Configuration
public class MybatisConfig {
}
