package Groupnate.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		System.out.println("Hello spring boot application");
		SpringApplication.run(AppApplication.class, args);
	}

}
