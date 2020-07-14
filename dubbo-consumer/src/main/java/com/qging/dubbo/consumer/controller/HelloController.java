package com.qging.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qging.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LLY
 * @date : 2020/7/14 11:10
 * description : TODO
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference(version="1.0.0",check = false)
    HelloService mHelloService;

    @RequestMapping("/{name}")
    public String syeHello(@PathVariable String name) {
        return mHelloService.sayHello(name);
    }
}
