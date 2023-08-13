package com.qyhlp.test;

import com.qyhlp.Utils.SQLSessionUtils;
import com.qyhlp.mapper.UserMapper;
import com.qyhlp.po.User;
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
        //功能
//        int result = mapper.insertUser();
//        mapper.updateUser();

//        User user = mapper.getUserById();
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
//        System.out.println("结果：" + result);

    }
}
