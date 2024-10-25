package com.SpringProjectAPI.demo.Restcontroller;


import com.SpringProjectAPI.demo.entity.Student;
import com.SpringProjectAPI.demo.studentError.StudentExceptionResponse;
import com.SpringProjectAPI.demo.studentError.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    private List<Student> studentinfos;

    @PostConstruct
    public void add()
    {

        studentinfos =   new ArrayList<>();
        Student student=new Student("Abdullah","Al Taawab");
        Student student2=new Student("Abdullah","Rapheo");
        Student student3=new Student("Abdullah","kalam");

        studentinfos.add(student);
        studentinfos.add(student2);
        studentinfos.add(student3);
    }

    @GetMapping("/name")
    public String Name()

    {
        return "Abdullah Al Taawab";
    }

    @GetMapping("/studentinfo")
    public List<Student> info()
    {

        return studentinfos;
    }

     @GetMapping("/singlestudent/{id}")
    public Student singlestudent(@PathVariable int id) {

         if (id >= studentinfos.size() || id < 0){

             throw  new StudentNotFoundException(" This Id did not found - " + id);
     }

        return studentinfos.get(id);
    }





}
