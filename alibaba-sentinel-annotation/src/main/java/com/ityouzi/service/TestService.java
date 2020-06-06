package com.ityouzi.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sun.deploy.security.BlockedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Auther: Liberal-World
 * @Date: 2020-06-05 16:01
 * @Description:
 * @Version 1.0
 */
@Slf4j
@Service
public class TestService {
    @SentinelResource(value = "doSomeThing", blockHandler = "exceptionHandler")
    public void doSomeThing(String str) {
        log.info(str);
    }

    /**
     * 限流与阻塞处理exceptionHandler，实现限流的异常处理
     */
    public void exceptionHandler(String str, BlockedException ex){
        log.error("blockHandler: " + str, ex);
    }



    /**
     * 熔断与降级处理
     */
    @SentinelResource(value = "doSomeThing2", fallback = "fallbackHandler")
    public void doSomeThing2(String str){
        log.info(str);
        throw new RuntimeException("发生异常");
    }
    public void fallbackHandler(String str){
        log.error("fallbackHandler: " + str);
    }
}
