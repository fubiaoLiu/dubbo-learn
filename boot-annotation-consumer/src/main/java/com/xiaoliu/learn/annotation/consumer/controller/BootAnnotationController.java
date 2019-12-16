package com.xiaoliu.learn.annotation.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaoliu.learn.api.service.BootAnnotationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: boot注解Controller
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
@RestController
public class BootAnnotationController {
    @Reference
    private BootAnnotationService bootAnnotationService;

    @GetMapping("/getNameById")
    public String getNameById(@RequestParam("id") long id) {
        return bootAnnotationService.getNameById(id);
    }
}
