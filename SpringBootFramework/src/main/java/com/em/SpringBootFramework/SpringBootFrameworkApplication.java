package com.em.SpringBootFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.security.auth.callback.ConfirmationCallback;

@SpringBootApplication
public class SpringBootFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootFrameworkApplication.class, args);
		SpringComponentDemo sDemo = context.getBean(SpringComponentDemo.class);
        System.out.println(sDemo.message());
//		SpringComponentDemo2 sDemo2= context.getBean(SpringComponentDemo2.class);
//		sDemo2.message2();

		//using Lombok
		Student s = new Student();
		s.setId(5);
		s.setName("Subash");
		System.out.println(s.getId());
		System.out.println(s.getName());
	}

}
