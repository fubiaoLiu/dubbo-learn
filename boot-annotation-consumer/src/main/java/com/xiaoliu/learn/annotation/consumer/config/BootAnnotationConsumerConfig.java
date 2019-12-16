package com.xiaoliu.learn.annotation.consumer.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: springboot注解consumer配置类
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
@Configuration
public class BootAnnotationConsumerConfig {
    /**
     * 对应xml配置:<dubbo:application name="boot-annotation-provider"/>
     *
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-annotation-consumer");
        return applicationConfig;
    }

    /**
     * 对应xml配置:<dubbo:registry address="zookeeper://127.0.0.1:2181"/>
     *
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }
}
