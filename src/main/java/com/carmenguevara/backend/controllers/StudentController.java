package com.carmenguevara.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carmenguevara.backend.models.Student;
import com.carmenguevara.backend.repositories.StudentRepository;


// ===== RESTCONTROLLER =====
// RestController is a Spring annotation that is used to build REST API. This will tell Spring to do it's configurations and allows us to make RESTful web service at runtime.

// SIDE NOTE: You may see some older code or some code using @Controller typically with @ResponseBody. @Controller has been used by traditional Spring MVC for a long time. @RestController was introduced in later versions of Spring which simplifies creating RESTful web services. @RestController is a combination of @Controller and @ResponseBody.

// ===== REQUESTMAPPING =====
// One of the most common annotation in Spring Web application. It handles our REST controllers in our MVC design pattern. We put this on top of our model controller. We can pass properties in here, but for simplicity and cleaner code we can just pass in a string that represents the beginning part of the URI (endpoints). This means our endpoints will have to have this in their URI.
// Difference between URL and URI: https://danielmiessler.com/study/difference-between-uri-url/
@RestController
@RequestMapping("/api/v1/")
public class StudentController {

// AUTOWIRED
//	Reminder: all Spring beans are handled in our Spring container AKA Application Context.
//	Our Spring container handles all of our objects (Beans), that includes definitions, WIRING them automatically, sending them out whenever we need them, creation, and deletion.
//	Under the hood, all of our beans are AUTOWIRED in the Spring Container
//	Autowiring happens by placing an instance of one bean into an instance of another bean.
//	Annotaion Autowired is a feature in Spring framework that enables dependency injection implicitly.
//	Tells oour application context to inject an instance of StudentRepository in this class.
		
	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
		
	}
	
}