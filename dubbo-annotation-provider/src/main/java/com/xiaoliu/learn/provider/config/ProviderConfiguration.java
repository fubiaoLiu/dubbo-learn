package com.xiaoliu.learn.provider.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description: provider配置类
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.xiaoliu.learn.provider.service")
@PropertySource("classpath:/provider.properties")
public class ProviderConfiguration {
}
