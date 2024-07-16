package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringbootGithubActionsApplication {

	@RequestMapping("/message")
	public String getMessage() {
		return "Welcome to Git hub actions";
	}
	
//	echo "# spring-boot-github-actions" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M master
//	git remote add origin https://github.com/maheshhavnoor/spring-boot-github-actions.git
//	git push -u origin master
	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubActionsApplication.class, args);
	}

}
