package cn.chaodahao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: cdh
 * @date: 2023/11/20 19:28
 * @descriptions: 支付模块主启动类
 */
@SpringBootApplication
@EnableEurekaClient //@EnableEurekaClient注释代表声明该类在Eureka服务注册中心注册服务
@EnableDiscoveryClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
