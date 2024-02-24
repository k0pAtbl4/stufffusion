package com.online_store.demo.service;

import com.online_store.demo.repository.ProductRepository;
import com.online_store.demo.entity.Product;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class ProductServiceBean implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }
}
