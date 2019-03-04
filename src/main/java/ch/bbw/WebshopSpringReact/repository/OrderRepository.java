package ch.bbw.WebshopSpringReact.repository;

import ch.bbw.WebshopSpringReact.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
