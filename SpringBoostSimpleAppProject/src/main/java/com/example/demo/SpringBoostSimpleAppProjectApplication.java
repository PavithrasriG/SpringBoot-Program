package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoostSimpleAppProjectApplication {

	public static  void main(String[] args) {


ConfigurableApplicationContext context =SpringApplication.run(SpringBoostSimpleAppProjectApplication.class, args);
Student sob=context.getBean(Student.class);	// student	
Course sob1=context.getBean(Course.class);	// course
  	
// Display the method
	sob.display();	
    sob1.courseDisplay();	
		
		
	}

	
}
