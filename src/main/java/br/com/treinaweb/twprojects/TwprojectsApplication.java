package br.com.treinaweb.twprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "br.com.treinaweb.twprojects.core.models")
@SpringBootApplication
public class TwprojectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwprojectsApplication.class, args);
	}

}
