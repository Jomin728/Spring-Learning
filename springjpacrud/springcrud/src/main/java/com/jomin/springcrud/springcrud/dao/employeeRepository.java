package com.jomin.springcrud.springcrud.dao;

import com.jomin.springcrud.springcrud.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employee,Integer> {
}
