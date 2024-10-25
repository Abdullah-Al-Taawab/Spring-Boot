package com.springbootrestapi.demo.dao;

import com.springbootrestapi.demo.entity.Employee;

import java.util.List;

public interface DAO {

    public List<Employee> findall();

    public Employee findByID(int Id);

    public Employee save(Employee employee);
}
