package br.com.projeto.langspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class LangspaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LangspaceApplication.class, args);
	}
}
