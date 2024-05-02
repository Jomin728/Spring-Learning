package com.jomin.springcrud.springcrud.service;

import com.jomin.springcrud.springcrud.dao.employeeDao;
import com.jomin.springcrud.springcrud.entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class dataService implements employeeService{

    private employeeDao empDao;
    @Autowired
    public dataService(employeeDao employeeDao)
    {
        this.empDao = employeeDao;
    }

    @Override
    public List<employee> findAll() {
        return empDao.getEmployeeList();
    }

    @Transactional
    @Override
    public employee findById(int theId) {
        return empDao.findById(theId);
    }

    @Transactional
    @Override
    public employee save(employee anEmployee) {
        return empDao.save(anEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
       empDao.deleteById(theId);
    }
}
