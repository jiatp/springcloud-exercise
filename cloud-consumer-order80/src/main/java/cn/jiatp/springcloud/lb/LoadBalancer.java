package cn.jiatp.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: jiatp
 * @Date:2020/3/2914:34
 * @InterfaceName: LoadBalancer
 * @Description: LoadBalancer自定义接口
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstance);  //实例总数
}
