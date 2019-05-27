package com.atguigu.mybatis.controller;

import com.atguigu.mybatis.bean.Employee;
import com.atguigu.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * This is Description
 *
 * @author 周振宇
 * @date 2019/05/27
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getemps")
    public String emps(Map<String, Object> map, HttpServletRequest request){
        List<Employee> emps = employeeService.getEmps();
        map.put("allEmps", emps);
        request.setAttribute("allEmpsfuck", emps);
//        return "list";
        return "fuckyou";
    }
}
