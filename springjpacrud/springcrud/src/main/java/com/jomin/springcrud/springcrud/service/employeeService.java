package com.jomin.springcrud.springcrud.service;

import com.jomin.springcrud.springcrud.entity.employee;

import java.util.List;

public interface employeeService {
    List<employee> findAll();

    employee findById(int theId);

    employee save(employee anEmployee);

    void deleteById(int theId);

}
