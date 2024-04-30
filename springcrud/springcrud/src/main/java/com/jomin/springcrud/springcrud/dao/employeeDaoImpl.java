package com.jomin.springcrud.springcrud.dao;

import com.jomin.springcrud.springcrud.entity.employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class employeeDaoImpl implements employeeDao{
    private EntityManager entityManager;
    @Autowired
    public employeeDaoImpl(EntityManager theentityManager)
    {
     entityManager=theentityManager;
    }
    @Override
    public List<employee> getEmployeeList() {
      TypedQuery<employee> query= entityManager.createQuery("from employee", employee.class);
      List<employee> employeeList = query.getResultList();
        return employeeList;
    }
}
