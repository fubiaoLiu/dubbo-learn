package com.xiaoliu.learn.consumer;

import com.xiaoliu.learn.api.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 启动类
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        // 获取远程服务代理
        UserService demoService = (UserService) context.getBean("userService");
        // 执行远程方法
        String username = demoService.getUsernameById(1L);
        // 显示调用结果
        System.out.println(username);
    }
}
