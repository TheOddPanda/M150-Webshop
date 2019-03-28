package ch.bbw.WebshopSpringReact.service.impl;

import ch.bbw.WebshopSpringReact.model.OrderProduct;
import ch.bbw.WebshopSpringReact.repository.OrderProductRepository;
import ch.bbw.WebshopSpringReact.service.OrderProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}