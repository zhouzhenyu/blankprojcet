package com.atguigu.mybatis.bean;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.id
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.lastName
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.email
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.gender
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    private String gender;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.id
     *
     * @return the value of tbl_employee.id
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.id
     *
     * @param id the value for tbl_employee.id
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.lastName
     *
     * @return the value of tbl_employee.lastName
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.lastName
     *
     * @param lastname the value for tbl_employee.lastName
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.email
     *
     * @return the value of tbl_employee.email
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.email
     *
     * @param email the value for tbl_employee.email
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.gender
     *
     * @return the value of tbl_employee.gender
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.gender
     *
     * @param gender the value for tbl_employee.gender
     *
     * @mbg.generated Mon Jun 03 04:21:48 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}