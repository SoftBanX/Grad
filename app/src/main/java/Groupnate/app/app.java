package Groupnate.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class app {

	@RequestMapping("/")
	String home() {
		return "►►►► WHO CARES WHO WINS?";
	}

	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}

}