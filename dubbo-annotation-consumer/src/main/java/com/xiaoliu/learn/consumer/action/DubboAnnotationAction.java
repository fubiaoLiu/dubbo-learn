package com.xiaoliu.learn.consumer.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaoliu.learn.api.service.DubboAnnotationService;
import org.springframework.stereotype.Component;

/**
 * @description: dubbo注解action
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
@Component
public class DubboAnnotationAction {
    @Reference
    private DubboAnnotationService dubboAnnotationService;

    public String getNameById(long id) {
        return dubboAnnotationService.getNameById(id);
    }
}
