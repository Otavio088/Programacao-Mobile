package edu.fatec.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "edu.fatec")
public class AulaApplication {

	public static void main(String...strings) {
		SpringApplication.run(AulaApplication.class);
	}
	
}
