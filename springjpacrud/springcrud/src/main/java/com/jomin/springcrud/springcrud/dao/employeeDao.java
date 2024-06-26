package com.jomin.springcrud.springcrud.dao;

import com.jomin.springcrud.springcrud.entity.employee;

import java.util.List;

public interface employeeDao {

    List<employee> getEmployeeList();

    employee findById(int theId);

    employee save(employee anEmployee);

    void deleteById(int theId);
}
