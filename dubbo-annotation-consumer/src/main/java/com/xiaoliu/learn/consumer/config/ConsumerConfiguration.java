package com.xiaoliu.learn.consumer.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description: consumer配置类
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.xiaoliu.learn.consumer.action")
@ComponentScan(value = "com.xiaoliu.learn.consumer.action")
@PropertySource("classpath:/consumer.properties")
public class ConsumerConfiguration {
}
