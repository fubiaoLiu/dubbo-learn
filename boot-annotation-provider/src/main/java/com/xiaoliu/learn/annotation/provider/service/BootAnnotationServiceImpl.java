package com.xiaoliu.learn.annotation.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoliu.learn.api.service.BootAnnotationService;

/**
 * @description: boot注解service
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
@Service
public class BootAnnotationServiceImpl implements BootAnnotationService {
    /**
     * 根据ID查询用户名
     *
     * @param id
     * @return
     */
    @Override
    public String getNameById(long id) {
        return "boot-annotation" + id;
    }
}
