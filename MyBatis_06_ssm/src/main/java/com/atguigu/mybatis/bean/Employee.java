package com.atguigu.mybatis.bean;

/**
 * This is Description
 *
 * @author 周振宇
 * @date 2019/05/27
 */
public class Employee {

    private int id;

    private String lastName;

    private String email;

    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
