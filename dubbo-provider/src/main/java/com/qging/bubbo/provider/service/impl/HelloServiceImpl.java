package com.qging.bubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qging.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author : LLY
 * @date : 2020/7/14 11:04
 * description : TODO
 */
@Component
@Service(version = "1.0.0", interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
