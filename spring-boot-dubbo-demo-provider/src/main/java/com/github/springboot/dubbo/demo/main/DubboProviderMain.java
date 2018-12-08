package com.github.springboot.dubbo.demo.main;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DubboProviderMain {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderMain.class).web(WebApplicationType.NONE)
                .run(args);
    }

}
