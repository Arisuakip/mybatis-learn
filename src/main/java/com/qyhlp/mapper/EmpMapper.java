package com.qyhlp.mapper;

import com.qyhlp.po.Emp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author liangcheng12
 * @date 2023/08/14
 * @description
 */
public interface EmpMapper {

    /**
     * 获得所有员工对象
     * @return
     */
    List<Emp> getAllEmp();

    /**
     * 获取带部门信息的员工
     * @param eid
     * @return
     */
    Emp getEmpAndDept(@Param("eid")Integer eid);
}
