package cn.chaodahao.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: cdh
 * @date: 2023/12/11 20:22
 * @descriptions:
 */
@Configuration
public class ApplicationContextBean {
    @Bean
    @LoadBalanced //负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
