package com.jomin.springcrud.springcrud.rest;

import com.jomin.springcrud.springcrud.dao.employeeDao;
import com.jomin.springcrud.springcrud.entity.employee;
import com.jomin.springcrud.springcrud.service.employeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class employeeRestController {

    private employeeService dataService;

    public employeeRestController(employeeService employeeService)
    {
        dataService = employeeService;
    }

    @GetMapping("/employees")
    public List<employee>findAll()
    {
        return dataService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public employee getEmployee(@PathVariable int employeeId)
    {

        employee theEmployee = dataService.findById(employeeId);
        if(theEmployee == null)
            throw new RuntimeException("Employee id not found"+employeeId);

        return theEmployee;
    }

    @PutMapping("/employees")
    public employee updateEmployee(@RequestBody employee theEmployee)
    {
        employee dbEmployee = dataService.save(theEmployee);
        return dbEmployee;

    }
    @DeleteMapping("/employees/{employeeId}")
    public String  deleteEmployee(@PathVariable int employeeId)
    {
     employee temp = dataService.findById(employeeId);
     if(temp == null)
         throw new RuntimeException("Employee doesnot exist");
     dataService.deleteById(employeeId);
     return "Deleted employee" + employeeId;
    }

}
