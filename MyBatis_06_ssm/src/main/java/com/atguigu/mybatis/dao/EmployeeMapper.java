package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;

import java.util.List;

/**
 * This is Description
 *
 * @author 周振宇
 * @date 2019/05/27
 */
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    List<Employee> getEmps();

}
