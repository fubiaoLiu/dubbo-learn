package com.xiaoliu.learn.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoliu.learn.api.service.DubboAnnotationService;

/**
 * @description: dubbo注解service
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
@Service
public class DubboAnnotationServiceImpl implements DubboAnnotationService {
    /**
     * 根据ID查询用户名
     *
     * @param id
     * @return
     */
    @Override
    public String getNameById(long id) {
        return "dubbo-annotation" + id;
    }
}
