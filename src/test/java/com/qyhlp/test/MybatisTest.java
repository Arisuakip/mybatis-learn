package com.qyhlp.test;

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

    @Test
    public void testMybatis() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlsessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        //获取SQLSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
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
