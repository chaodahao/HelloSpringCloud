package cn.chaodahao.springcloud.lb;

import com.netflix.loadbalancer.ILoadBalancer;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author: cdh
 * @date: 2023/11/26 15:30
 * @descriptions: 自定义负载均衡接口
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstanceList);
}
