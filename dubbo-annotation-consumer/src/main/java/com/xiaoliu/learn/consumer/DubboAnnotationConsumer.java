package com.xiaoliu.learn.consumer;

import com.xiaoliu.learn.consumer.action.DubboAnnotationAction;
import com.xiaoliu.learn.consumer.config.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @description: 启动类
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
public class DubboAnnotationConsumer {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        DubboAnnotationAction action = context.getBean(DubboAnnotationAction.class);
        System.out.println(action.getNameById(1));
    }
}
