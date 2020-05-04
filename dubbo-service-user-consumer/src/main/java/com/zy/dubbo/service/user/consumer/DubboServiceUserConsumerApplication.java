package com.zy.dubbo.service.user.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboServiceUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceUserConsumerApplication.class, args);
    }

}
