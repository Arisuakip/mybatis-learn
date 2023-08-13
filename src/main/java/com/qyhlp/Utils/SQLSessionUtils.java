package com.qyhlp.Utils;

import com.qyhlp.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author liangcheng
 * @date 2023/08/13
 * @description
 **/
public class SQLSessionUtils {

    public static SqlSession getSqlSession() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlsessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        //获取SQLSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return  sqlSession;
    }
}
