package com.xiaoliu.learn.annotation.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 启动类
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
// 同@DubboComponentScan(basePackages = "com.xiaoliu.learn.annotation.provider.service")
@EnableDubbo(scanBasePackages = "com.xiaoliu.learn.annotation.provider.service")
@SpringBootApplication
public class BootAnnotationProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAnnotationProviderApplication.class, args);
    }
}

