package ch.bbw.WebshopSpringReact;

import ch.bbw.WebshopSpringReact.model.Product;
import ch.bbw.WebshopSpringReact.service.ProductService;
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
			initProducts(productService);
		};
	}

	private void initProducts(ProductService productService) {
		productService.save(new Product(1L, "Gameboy Advance", 300.00, "http://placehold.it/200x100"));
		productService.save(new Product(2L, "PS4", 200.00, "http://placehold.it/200x100"));
		productService.save(new Product(3L, "PS3", 100.00, "http://placehold.it/200x100"));
		productService.save(new Product(4L, "PS2", 100.00, "http://placehold.it/200x100"));
		productService.save(new Product(5L, "PS1", 100.00, "http://placehold.it/200x100"));
		productService.save(new Product(6L, "Gameboy Color", 50.0, "http://placehold.it/200x100"));
		productService.save(new Product(7L, "NES", 500.00, "http://placehold.it/200x100"));
	}
}
