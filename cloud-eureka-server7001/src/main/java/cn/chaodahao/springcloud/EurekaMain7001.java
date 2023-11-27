package cn.chaodahao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: cdh
 * @date: 2023/11/21 20:22
 * @descriptions: Eureka注册中心主启动类
 */
@SpringBootApplication
@EnableEurekaServer //@EnableEurekaServer注释代表声明该类为服务注册中心
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
