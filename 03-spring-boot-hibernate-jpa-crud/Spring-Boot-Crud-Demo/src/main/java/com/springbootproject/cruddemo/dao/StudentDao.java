package com.springbootproject.cruddemo.dao;


import com.springbootproject.cruddemo.entity.Student;

import java.util.List;


public interface StudentDao {

    void save(Student student);
    Student findByID(int id);

    List<Student>  findAll (String lastName);

    int update(String data);

    int delete(int id);
}
