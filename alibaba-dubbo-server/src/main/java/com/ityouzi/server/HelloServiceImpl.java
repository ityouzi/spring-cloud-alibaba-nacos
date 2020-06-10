package com.ityouzi.server;


import com.ityouzi.api.HelloService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @auther: lizhen
 * @date: 2020-06-07 16:58
 * 功能描述: 实现Dubbo接口
 */

@Service            // 这里的@Service注解不是Spring的，而是org.apache.dubbo.config.annotation.Service注解
public class HelloServiceImpl implements HelloService {


    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
