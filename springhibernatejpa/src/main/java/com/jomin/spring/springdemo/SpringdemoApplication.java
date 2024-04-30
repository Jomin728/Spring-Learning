package com.jomin.spring.springdemo;

import com.jomin.spring.springdemo.dao.studentDao;
import com.jomin.spring.springdemo.entity.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//@SpringBootApplication(scanBasePackages = {"com.jomin.springscandemo","com.jomin.springutils"})
@SpringBootApplication
class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}
    @Bean
	public CommandLineRunner commandLineRunner(studentDao studentDao, String[] args)
	{
      return runner -> {
//		  createMultipleStudent(studentDao);
//		  readStudent(studentDao);
//		  getAllStudents(studentDao);
//		  findByLastname(studentDao);
//		  updateStudent(studentDao);
		  deleteStudent(studentDao);
	  };
	}

	public void createMultipleStudent(studentDao studentDao)
	{
		student tempstudent1 = new student("sanju","samson","sanjusamson@gmail.com");
		student tempstudent2 = new student("virat","kohli","viratkohli@gmail.com");
		student tempstudent3 = new student("MS","Dhoni","msdhoni@gmail.com");
		studentDao.save(tempstudent1);
		studentDao.save(tempstudent2);
		studentDao.save(tempstudent3);

		//save student objects

	}
	private void readStudent(studentDao studentDao)
	{
		student tempstudent = new student("john","doe","johndoe@gmail.com");

		studentDao.save(tempstudent);

		int id =  tempstudent.getId();

		System.out.println("Saved Student generated id is : " + tempstudent.getId());

		student myStudent = studentDao.findBydid(id);
//
		System.out.println("Found the student: " + myStudent);
	}
	private void findByLastname(studentDao studentDao)
	{
		List<student> studentList = studentDao.findBylastName("rajesh");
		for(student temp:studentList)
		{
			System.out.println(temp);
		}

	}
	private void updateStudent(studentDao studentDao)
	{
		student tempStudent = studentDao.findBydid(2);
		System.out.println(tempStudent);
		tempStudent.setFirstName("jerry");

		studentDao.updateStudent(tempStudent);

		studentDao.findBydid(2);
		System.out.println(tempStudent);


	}
	private void deleteStudent(studentDao studentDao)
	{
		studentDao.delete(2);
	}
	private void getAllStudents(studentDao studentDao)
	{
		List<student> studentList =  studentDao.findAll();

		for(student temp:studentList)
		{
			System.out.println(temp);
		}

	}
	private void createStudent(studentDao studentDao) {
		//create student object,
		System.out.println("Creating new student object");
		student tempstudent = new student("jomin","rajesh","jominrajesh@gmail.com");

		//save student
		studentDao.save(tempstudent);
		//display id of saved student

		System.out.println("Saved Student generated id is : " + tempstudent.getId());

	}
}
