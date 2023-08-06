package com.qyhlp.mapper;

import com.qyhlp.po.User;

import java.util.List;

/**
 * mapper接口
 * @author liancheng
 */
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();
}
