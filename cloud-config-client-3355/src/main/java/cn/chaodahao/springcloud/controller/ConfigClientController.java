package cn.chaodahao.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cdh
 * @date: 2023/12/7 19:34
 * @descriptions:
 */
@RestController
@RefreshScope//刷新，动态监控
public class ConfigClientController {

    @Value("${configuration.infomations}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
