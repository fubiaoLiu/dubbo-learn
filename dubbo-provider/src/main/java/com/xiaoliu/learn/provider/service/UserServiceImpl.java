package com.xiaoliu.learn.provider.service;

import com.xiaoliu.learn.api.service.UserService;

/**
 * @description: 用户service
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
public class UserServiceImpl implements UserService {
    /**
     * 根据ID查询用户名
     *
     * @param id
     * @return
     */
    public String getUsernameById(long id) {
        return "用户" + id;
    }
}
