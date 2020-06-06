package com.ityouzi;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: Liberal-World
 * @Date: 2020-06-05 15:54
 * @Description: @SentinelResource注解灵活的定义控制资源以及如何配置控制策略
 * @Version 1.0
 */
@SpringBootApplication
public class SentinelResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelResourceApplication.class, args);
    }


    /**
     * 添加注解支持配置bean
     */
    @Bean
    public SentinelResourceAspect sentinelResourceAspect(){
        return new SentinelResourceAspect();
    }







}
