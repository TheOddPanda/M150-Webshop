package ch.bbw.WebshopSpringReact.repository;

import ch.bbw.WebshopSpringReact.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}