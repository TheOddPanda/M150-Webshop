package ch.bbw.WebshopSpringReact;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebshopSpringReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebshopSpringReactApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductService productService) {
		return args -> {
			productService.save(...);
			// more products
		};
	}
}
