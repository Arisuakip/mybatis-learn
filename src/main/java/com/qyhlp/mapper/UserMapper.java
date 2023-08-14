package com.qyhlp.mapper;

import com.qyhlp.po.User;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

/**
 * mapper接口
 * @author liancheng
 */
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser(User user);

    void updateUser();

    void deleteUser();

    User getUserById(@Param("id")Integer id);

    List<User> getAllUser();

    User getUserByUsername(String username);

    User checkLogin(String username,String password);

    User checkLoginByMap(Map<String,Object> map);

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);

    /**
     * 查询用户信息总记录数
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为一个map集合
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息为Map
     */
    @MapKey("id")
    Map<String,Object> getAllUserToMap();
}
