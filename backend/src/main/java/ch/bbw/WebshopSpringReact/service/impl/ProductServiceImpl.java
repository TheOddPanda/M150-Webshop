package ch.bbw.WebshopSpringReact.service.impl;

import ch.bbw.WebshopSpringReact.exception.ResourceNotFoundException;
import ch.bbw.WebshopSpringReact.model.Product;
import ch.bbw.WebshopSpringReact.repository.ProductRepository;
import ch.bbw.WebshopSpringReact.service.ProductService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}