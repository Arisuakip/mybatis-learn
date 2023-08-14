package com.qyhlp.test;

import com.qyhlp.Utils.SQLSessionUtils;
import com.qyhlp.mapper.EmpMapper;
import com.qyhlp.po.Emp;
import java.io.IOException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author liangcheng12
 * @date 2023/08/14
 * @description
 */
public class ResultMapTest {

    @Test
    public void testEmp() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp> allEmp = mapper.getAllEmp();
        System.out.println(allEmp);
    }

    @Test
    public void testGetEmpAndDept() throws IOException {
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp empAndDept = mapper.getEmpAndDept(1);
        System.out.println(empAndDept);
    }

}
