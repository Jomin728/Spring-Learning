package com.jomin.spring.springdemo.dao;

import com.jomin.spring.springdemo.entity.student;

import java.util.List;

public interface studentDao {

    void save(student newstudent);

    student findBydid(Integer id);

    List<student> findAll();

    List<student> findBylastName(String lastname);

    void  updateStudent(student updatesStudent);

     void delete(Integer num);

     Integer deleteAll();

}
