package cn.chaodahao.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: cdh
 * @date: 2023/11/26 17:16
 * @descriptions: FeignConfig  日志增强功能,FULL
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLofferLevel(){
        return Logger.Level.FULL;
    }
}
