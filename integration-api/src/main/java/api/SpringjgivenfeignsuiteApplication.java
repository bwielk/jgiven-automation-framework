package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"api.components"})
public class SpringjgivenfeignsuiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjgivenfeignsuiteApplication.class, args);
	}
}
