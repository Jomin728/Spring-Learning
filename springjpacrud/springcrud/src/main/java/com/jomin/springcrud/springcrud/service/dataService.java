package com.jomin.springcrud.springcrud.service;

import com.jomin.springcrud.springcrud.dao.employeeDao;
import com.jomin.springcrud.springcrud.dao.employeeRepository;
import com.jomin.springcrud.springcrud.entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class dataService implements employeeService{

    private employeeRepository empRepo;
    @Autowired
    public dataService(employeeRepository empRepo)
    {
        this.empRepo = empRepo;
    }

    @Override
    public List<employee> findAll() {
        return empRepo.findAll();
    }

    @Transactional
    @Override
    public employee findById(int theId) {
        Optional<employee> temp = empRepo.findById(theId);
        employee result = null;
        if(temp.isPresent())
        {
            result = temp.get();
        }
        else {
            throw new RuntimeException("Could not find" + theId);
        }
        return result;
    }

    @Transactional
    @Override
    public employee save(employee anEmployee) {
        return empRepo.save(anEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        empRepo.deleteById(theId);
    }
}
