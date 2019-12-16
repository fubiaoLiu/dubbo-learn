package com.xiaoliu.learn.annotation.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 启动类
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
@EnableDubbo(scanBasePackages = "com.xiaoliu.learn.annotation.consumer.controller")
@SpringBootApplication
public class BootAnnotationConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAnnotationConsumerApplication.class, args);
    }
}

