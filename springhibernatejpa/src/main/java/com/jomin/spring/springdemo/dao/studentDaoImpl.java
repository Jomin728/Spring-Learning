package com.jomin.spring.springdemo.dao;

import com.jomin.spring.springdemo.entity.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class studentDaoImpl implements studentDao{

    //inject entity manager using constructor

    private EntityManager entityManager;


    @Autowired
    public studentDaoImpl(EntityManager entityManager) {
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public void save(student newstudent) {
      entityManager.persist(newstudent);
    }

    @Override
    @Transactional
    public student findBydid(Integer id) {
        return entityManager.find(student.class,id);
    }

    @Override
    public List<student> findAll() {
        TypedQuery<student> theQuery = entityManager.createQuery("From student order by lastName asc",student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<student> findBylastName(String thelastname)
    {
     TypedQuery<student> thequery = entityManager.createQuery("From student where lastName =:theData", student.class);
thequery.setParameter("theData",thelastname);
return  thequery.getResultList();
    }

    @Override
    @Transactional
    public void updateStudent(student updatesStudent) {

    entityManager.merge(updatesStudent);
    }

    @Override
    public void delete(Integer num) {
        student retrieveStudent = entityManager.find(student.class,num);
        entityManager.remove(retrieveStudent);
    }

    @Override
    public  Integer deleteAll()
    {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM STUDENT").executeUpdate();
        return numRowsDeleted;
    }

}
