package ch.bbw.WebshopSpringReact.repository;

import ch.bbw.WebshopSpringReact.model.OrderProduct;
import ch.bbw.WebshopSpringReact.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
