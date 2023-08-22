package com.qyhlp.mapper;

import com.qyhlp.po.Emp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author liangcheng12
 * @date 2023/08/15
 * @description
 */
public interface DynamicSQLMapper {

    /** 111
     * 多条件查询
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量删除
     * @param eids
     * @return
     */
    Integer deleteMoreByArray(@Param("eids") Integer[] eids);

    /**
     * 批量添加
     * @param emps
     * @return
     */
    Integer batchInsertEmp(@Param("emps")List<Emp> emps);

}
