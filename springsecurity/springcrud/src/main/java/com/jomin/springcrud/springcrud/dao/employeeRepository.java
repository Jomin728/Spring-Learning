package com.jomin.springcrud.springcrud.dao;

import com.jomin.springcrud.springcrud.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "members") //now its /members not /employees
public interface employeeRepository extends JpaRepository<employee,Integer> {
}
