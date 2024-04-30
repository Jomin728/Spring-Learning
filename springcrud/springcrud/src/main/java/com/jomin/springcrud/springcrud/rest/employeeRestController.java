package com.jomin.springcrud.springcrud.rest;

import com.jomin.springcrud.springcrud.dao.employeeDao;
import com.jomin.springcrud.springcrud.entity.employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class employeeRestController {

    private employeeDao employeeDao;

    public employeeRestController(employeeDao employeesDao)
    {
        employeeDao = employeesDao;
    }

    @GetMapping("/employees")

    public List<employee>findAll()
    {
        return employeeDao.getEmployeeList();
    }

}
