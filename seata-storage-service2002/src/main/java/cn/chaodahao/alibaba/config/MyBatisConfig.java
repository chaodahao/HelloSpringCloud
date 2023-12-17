package cn.chaodahao.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cdh
 * @date 2023/12/16 21:44
 * @descriptions
 */
@Configuration
@MapperScan({"cn.chaodahao.alibaba.dao"})
public class MyBatisConfig {
}
