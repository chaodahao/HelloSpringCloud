package cn.chaodahao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: cdh
 * @date: 2023/11/26 16:24
 * @descriptions: 使用OpenFeign的订单模块主启动类
 */
@SpringBootApplication
@EnableFeignClients //开启OpenFeign的使用
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
