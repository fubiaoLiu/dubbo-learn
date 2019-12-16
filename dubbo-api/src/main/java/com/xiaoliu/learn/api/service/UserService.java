package com.xiaoliu.learn.api.service;

/**
 * @description: 用户service
 * @author: FuBiaoLiu
 * @date: 2019/12/16
 */
public interface UserService {
    /**
     * 根据ID查询用户名
     *
     * @param id
     * @return
     */
    String getUsernameById(long id);
}
