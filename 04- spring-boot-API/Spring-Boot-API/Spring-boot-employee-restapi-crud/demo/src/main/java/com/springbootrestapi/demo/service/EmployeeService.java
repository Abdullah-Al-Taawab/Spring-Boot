package com.springbootrestapi.demo.service;

import com.springbootrestapi.demo.dao.DAOStudentImp;
import com.springbootrestapi.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    private DAOStudentImp daoStudentImp;

    @Autowired
    public EmployeeService(DAOStudentImp daoStudentImp)
    {
        this.daoStudentImp=daoStudentImp;
    }


    public Employee findByID(int id)
    {
        return daoStudentImp.findByID(id);
    }

    public List<Employee> find()
    {
        return daoStudentImp.findall();
    }

    @Transactional
    public Employee save(Employee  employee)

    {
        Employee employee1=daoStudentImp.save(employee);
        return employee1;
    }











}
