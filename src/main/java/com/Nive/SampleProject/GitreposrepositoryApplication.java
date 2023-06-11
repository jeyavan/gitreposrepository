package com.Nive.SampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitreposrepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
		SpringApplication.run(GitreposrepositoryApplication.class, args);
		 Home h=context.getBean(Home.class);                //create the home object using with bean method
			h.connect();
	}

}
