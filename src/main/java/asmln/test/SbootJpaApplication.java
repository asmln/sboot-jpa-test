package asmln.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@Import(InfrastructureConfig.class)
public class SbootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootJpaApplication.class, args);
	}

}
