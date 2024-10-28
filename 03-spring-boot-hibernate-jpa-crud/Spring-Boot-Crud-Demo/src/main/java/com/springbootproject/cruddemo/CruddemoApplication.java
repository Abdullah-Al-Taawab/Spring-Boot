package com.springbootproject.cruddemo;

import com.springbootproject.cruddemo.dao.StudentDao;
import com.springbootproject.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao)
	{

		return runner ->
		{
			//createStudent(studentDao);
			//SearchID(studentDao,1);\
			//queryforStudents(studentDao);
			//updatevalue(studentDao);
			deleterow(studentDao);
		};
	}


	public void updatevalue(StudentDao studentDao)
	{
		int temp=studentDao.update("Anik");
		if(temp==1)
		{
			System.out.println(" Updated ");
		}
		else {
			System.out.println(" There is a problem occured ");
		}
	}

	public void deleterow(StudentDao studentDao)
	{
		int temp=studentDao.delete(1);
		if(temp==1)
		{
			System.out.println(" Row deleted done ");
		}
		else
		{
			System.out.println(" There is a problem occured ");
		}
	}

	private void queryforStudents(StudentDao studentDao )
	{
		List<Student> list=studentDao.findAll("Taawab");

		for( Student tempstudent: list)
		{
			System.out.println(tempstudent);
		}



	}

	private void SearchID(StudentDao studentDao, int ID) {

		Student student=studentDao.findByID(ID);
		System.out.println(student);

	}

	private void createStudent(StudentDao studentDao)

	{
		System.out.println(" Creating new student Object ");

		Student student=new Student("Abdullah", "Taawab", "abdullah.al.taawab@g.bracu.ac.bd");

		System.out.println( " Saving these datas ");

		studentDao.save(student);
	}
}
