package com.student.manager.studentmanager;

import com.student.manager.studentmanager.entity.Student;
import com.student.manager.studentmanager.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagerApplication.class, args);
	}

	@Autowired
	private studentRepository StudentRepo;
	@Override
	public void run(String... args) throws Exception {

		Student student1=new Student("ABC","DEF","abc@gmail.com");
		StudentRepo.save(student1);
		Student student2=new Student("Adam","Gilchrist","ghi@gmail.com");
		StudentRepo.save(student2);
		Student student3=new Student("Mathew","Hayden","adam@gmail.com");
		StudentRepo.save(student3);

	}
}
