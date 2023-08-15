package com.qyhlp.mapper;

import com.qyhlp.po.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author liangcheng12
 * @date 2023/08/14
 * @description
 */
public interface DeptMapper {

    /**
     * 分步查询部门信息
     * @param did
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("did")Integer did);

    /**
     * 以部门为主查员工
     * @param did
     * @return
     */
    Dept getDeptAndEmp(@Param("did")Integer did);

}
