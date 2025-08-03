package com.cjc.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.app.model.Student;
import com.cjc.app.repository.StudentRepository;

@SpringBootApplication
public class Application {

        int x = 100;


	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);

		Student s1 = new Student(2, "Sham", "Pune", 95.25f);
		Student s2 = new Student(3, "Sham", "Nashik", 95.25f);
		Student s3 = new Student(4, "Raju", "Pune", 95.25f);
		Student s4 = new Student(5, "Banti", "Mumbai", 95.25f);

		List<Student> list = Arrays.asList(s1, s2, s3, s4);

		repository.saveAll(list);

	}

	private static void saveRecord(StudentRepository repository) {
		Student stu1 = new Student();
		stu1.setRollno(1);
		stu1.setName("Ram");
		stu1.setAddress("Pune");
		stu1.setMarks(85.25f);

		repository.save(stu1);
	}

}
