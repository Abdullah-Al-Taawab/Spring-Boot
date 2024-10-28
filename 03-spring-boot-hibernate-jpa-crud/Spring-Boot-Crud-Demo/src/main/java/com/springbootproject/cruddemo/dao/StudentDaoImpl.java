package com.springbootproject.cruddemo.dao;

import com.springbootproject.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{


    private EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager)
    {
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public void save(Student student)
    {
        entityManager.persist(student);
    }
    public Student findByID(int id)
    {
       return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll(String lastName) {

        TypedQuery<Student> query=entityManager.createQuery("from Student where firstName= :name", Student.class); //here Student is pointing the entity class not database. all are from entity class
        query.setParameter("name",lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public int update(String data)
    {
        Query query=entityManager.createQuery("UPDATE Student SET email=:data where firstName='Taawab'");

        query.setParameter("data",data);

        int temp= query.executeUpdate();
        return temp;

    }

    @Override
    @Transactional
   public int delete(int id)
    {
        Query query=entityManager.createQuery("Delete from Student where id=:id");
        query.setParameter("id", id);

        int temp= query.executeUpdate();
        return temp;

    }


}
