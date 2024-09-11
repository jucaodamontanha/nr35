package br.com.linekerx.nr35;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Nr35Application {

	public static void main(String[] args) {
		SpringApplication.run(Nr35Application.class, args);
	}
}
