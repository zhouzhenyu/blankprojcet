package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;
import java.util.List;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    List<Employee> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    int updateByPrimaryKey(Employee record);
}