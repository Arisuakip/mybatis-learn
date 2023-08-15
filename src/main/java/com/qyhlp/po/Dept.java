package com.qyhlp.po;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部门信息表
 * @author liangcheng12
 * @date 2023/08/14
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer did;

    private String deptName;

    private List<Emp> emps;

}
