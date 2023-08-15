package com.qyhlp.test;

import com.qyhlp.Utils.SQLSessionUtils;
import com.qyhlp.mapper.DynamicSQLMapper;
import com.qyhlp.mapper.EmpMapper;
import com.qyhlp.po.Emp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author liangcheng12
 * @date 2023/08/15
 * @description
 */
public class DynamicSQLMapperTest {

    @Test
    public void testGetEmpByCondition() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Emp emp = new Emp();
        emp.setEmpName("zhangsan");
        emp.setAge(18);
        emp.setSex("men");
        emp.setEmail("114@qq.com");

        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        System.out.println(empByCondition);

    }

    @Test
    public void testGetEmpByChoose() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Emp emp = new Emp();
//        emp.setEmpName("zhangsan");
//        emp.setAge(18);
//        emp.setSex("men");
//        emp.setEmail("114@qq.com");

        List<Emp> empByCondition = mapper.getEmpByChoose(emp);
        System.out.println(empByCondition);
    }

    @Test
    public void testDeleteMoreByArray() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Integer emps = mapper.deleteMoreByArray(new Integer[]{7,8});
        System.out.println(emps);
    }

    @Test
    public void testBatchInsert() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emps = new ArrayList<>();
        emps.add(new Emp(null,"jiaran",24,"women","222@22.com",null));
        emps.add(new Emp(null,"xiangwan",25,"women","111@22.com",null));
        Integer integer = mapper.batchInsertEmp(emps);
        System.out.println(integer);
    }

}
