package com.springbootrestapi.demo.dao;

import com.springbootrestapi.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DAOStudentImp implements DAO{

    private EntityManager entityManager;

    @Autowired
    public DAOStudentImp(EntityManager entityManager)
    {
        this.entityManager=entityManager;
    }

    public List<Employee> findall()
    {
        TypedQuery<Employee> query= entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employeesList=query.getResultList();

        return employeesList;
    }

    public Employee findByID(int Id)
    {
        Employee em=entityManager.find(Employee.class,Id);
        return em;
    }

    public Employee save(Employee employee)
    {

        entityManager.persist(employee);
        return employee;

    }
}
