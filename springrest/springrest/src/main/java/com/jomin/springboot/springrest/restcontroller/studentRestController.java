package com.jomin.springboot.springrest.restcontroller;

import com.jomin.springboot.springrest.entity.student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class studentRestController {

    private List<student> studentList ;

    @PostConstruct
    public void constructor()
    {
        studentList = new ArrayList<>();

        studentList.add(new student("jomin","rajesh"));
        studentList.add(new student("jerry","rajesh"));
        studentList.add(new student("joel","rajesh"));

    }
    @GetMapping("/studentlist")
    public List<student> getStudents()
    {
        return studentList;
    }

    @GetMapping("/students/{studentId}")
    public student getStudent(@PathVariable int studentId)
    {
        if(studentId >= studentList.size() || studentId <0) throw new customsExceptionClass("Student id not found -" + studentId);
     return studentList.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<studentErrorResponse> handleException(customsExceptionClass exc)
    {
       studentErrorResponse errorResponse = new studentErrorResponse();
       errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
       errorResponse.setMessage(exc.getMessage());
       errorResponse.setTimestamp(System.currentTimeMillis());

       return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

    }

}
