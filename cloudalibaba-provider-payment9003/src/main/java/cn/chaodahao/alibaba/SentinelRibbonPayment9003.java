package cn.chaodahao.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: cdh
 * @date: 2023/12/13 20:06
 * @descriptions:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelRibbonPayment9003 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelRibbonPayment9003.class, args);
    }
}
