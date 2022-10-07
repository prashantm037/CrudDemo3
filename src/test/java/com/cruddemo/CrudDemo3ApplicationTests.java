package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entity.Student;
import com.cruddemo.repository.StudentRepository;

@SpringBootTest
class CrudDemo3ApplicationTests {
	
	@Autowired
	private StudentRepository studentrepo;

	@Test
	void saveOnestudentInfo() {
		Student s=new Student();
		s.setName("sumit");
		s.setCourse("Development");
		s.setFee(25000);
		studentrepo.save(s);
	}
	@Test
	void deleteOneStudentInfo() {
		studentrepo.deleteById(7l);
	}
	
	@Test
	void updateonestudentInfo() {
		Student s=new Student();
		s.setId(1L);
		s.setName("Prashant");
		s.setCourse("Development");
		s.setFee(45000);
		studentrepo.save(s);
	}
	
	@Test
	void getOneStudentInfo() {
		Optional<Student> findById = studentrepo.findById(1l);
		Student s = findById.get();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
	}

}
