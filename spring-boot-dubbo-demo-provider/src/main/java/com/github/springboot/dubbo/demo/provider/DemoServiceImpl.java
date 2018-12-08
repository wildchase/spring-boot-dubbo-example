package com.github.springboot.dubbo.demo.provider;

import java.util.concurrent.atomic.AtomicInteger;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.springboot.dubbo.demo.api.DemoService;

@Service(version = "${service.version}")
public class DemoServiceImpl implements DemoService {

    public final static AtomicInteger a = new AtomicInteger(0);

    @Override
    public String sayHello(String name) {
        return a.getAndIncrement() + ":" + name;
    }

}
