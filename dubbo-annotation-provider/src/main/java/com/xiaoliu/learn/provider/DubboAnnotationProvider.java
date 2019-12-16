package com.xiaoliu.learn.provider;

import com.xiaoliu.learn.provider.config.ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @description: 启动类
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
public class DubboAnnotationProvider {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("DubboAnnotationProvider服务已经启动...");
        System.in.read();
    }
}
