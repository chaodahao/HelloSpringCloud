package cn.chaodahao.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: cdh
 * @date: 2023/11/26 12:11
 * @descriptions: 自定义实现负载均衡算法; 自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下， 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，达不到特殊化定制的目的了。
 *                  在OrderMain80启动类的@SpringBootApplication注解里面包含了@ComponentScan,即OrderMain80能扫描到当前包下以及子包下.
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//随机
    }
}
