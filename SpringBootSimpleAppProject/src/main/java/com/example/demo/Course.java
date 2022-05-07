package com.example.demo;

import org.springframework.stereotype.Component;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Component
public class Course {

	void courseDisplay() {
		System.out.println("Java Full Stack Developer");
		System.out.println("Display the method");
	}
	
}
