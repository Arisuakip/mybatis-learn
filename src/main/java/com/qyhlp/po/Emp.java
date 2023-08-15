package com.qyhlp.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * 员工信息表
 * @author liangcheng12
 * @date 2023/08/14
 * @description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {

    private Integer eid;

    private String empName;

    private Integer age;

    private String sex;

    private String email;

    private Dept dept;

}
