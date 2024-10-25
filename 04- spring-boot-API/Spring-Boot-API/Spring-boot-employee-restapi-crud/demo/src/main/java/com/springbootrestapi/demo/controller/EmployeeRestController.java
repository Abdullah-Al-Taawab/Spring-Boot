package com.springbootrestapi.demo.controller;


import com.springbootrestapi.demo.exception.EmployeeException;
import com.springbootrestapi.demo.entity.Employee;
import com.springbootrestapi.demo.response.EmployeeResponse;
import com.springbootrestapi.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController( EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> employees()
    {
        List<Employee> em=employeeService.find();

        return employeeService.find();
    }

    @GetMapping("/employees/{id}")
    public Employee employee(@PathVariable int id)
    {
        Employee em=employeeService.findByID(id);
        return em;
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeResponse> add(@RequestBody Employee employee)
    {

        try{
            EmployeeResponse response = new EmployeeResponse();

            Employee employeetemp = employeeService.save(employee);
            response.setId(employeetemp.getId());
            response.setMessage(" Successfull ");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new EmployeeException(" Bad Request ");
        }


    }



}
