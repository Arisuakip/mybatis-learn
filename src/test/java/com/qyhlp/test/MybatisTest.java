package com.qyhlp.test;

import com.qyhlp.Utils.SQLSessionUtils;
import com.qyhlp.mapper.SQLMapper;
import com.qyhlp.mapper.UserMapper;
import com.qyhlp.po.User;
import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author liangcheng
 * @date 2023/08/06
 * @description
 **/
public class MybatisTest {
    //${}字符串拼接；#{}占位符赋值

    @Test
    public void testMybatis() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        User user = mapper.checkLoginByParam("wanger", "114515");
        User user = mapper.getUserById(3);
        System.out.println(user);

    }


    @Test
    public void testGetCount() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        User user = mapper.checkLoginByParam("wanger", "114515");
        Integer count = mapper.getCount();
        System.out.println(count);

    }

    @Test
    public void testGetUserByIdToMap() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        User user = mapper.checkLoginByParam("wanger", "114515");
        Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(3);
        System.out.println(userByIdToMap);
    }

    @Test
    public void testGetAllUserToMap() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        User user = mapper.checkLoginByParam("wanger", "114515");
        Map<String, Object> allUserToMap = mapper.getAllUserToMap();
        System.out.println(allUserToMap);
    }

    @Test
    public void testGetUserByLike() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        //获取mapper接口对象
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

//        User user = mapper.checkLoginByParam("wanger", "114515");
        List<User> wan = mapper.getUserByLike("wan");
        System.out.println(wan);
    }

    @Test
    public void testDeleteByIdList() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        //获取mapper接口对象
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        int i = mapper.deleteByIdList("1,2");
        System.out.println(i);
    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        //获取mapper接口对象
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        User user = new User(null,"wangwu","123",11,"men","1231@gmail.com");
        int i = mapper.insertUser(user);
        System.out.println(user.getId());
    }

}
