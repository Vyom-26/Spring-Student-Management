package com.exampl.StudentManagement.studentManag;

import com.exampl.StudentManagement.studentManag.entity.Student;
import com.exampl.StudentManagement.studentManag.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Ramesh", "Kumar", "ramesh@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Tony", "Stark", "tony@gmail.com");
		studentRepository.save(student2);
	}
}
