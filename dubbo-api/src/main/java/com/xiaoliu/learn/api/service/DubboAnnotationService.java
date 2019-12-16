package com.xiaoliu.learn.api.service;

/**
 * @description: dubbo注解service
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
public interface DubboAnnotationService {
    /**
     * 根据ID查询注解名
     *
     * @param id
     * @return
     */
    String getNameById(long id);
}
