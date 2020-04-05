package cn.jiatp.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jiatp
 * @Date:2020/4/117:41
 * @ClassName: GateConfig
 * @Description:
 */
@Configuration
public class GateConfig {

    /*
    * 配置一个id为path_jiatp的路由规则
    * 当前访问地址http://localhost:9527/guonei时会自动转发到地址，http://news.baidu.com/guonei
    * */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_jiatp",r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
