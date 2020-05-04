package com.zy.dubbo.service.user.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboServiceUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceUserProviderApplication.class, args);
        Main.main(args);
    }

}