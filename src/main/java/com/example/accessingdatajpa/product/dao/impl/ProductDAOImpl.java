package com.example.accessingdatajpa.product.dao.impl;

import com.example.accessingdatajpa.product.dao.ProductDAO;
import com.example.accessingdatajpa.product.entity.ProductEntity;
import com.example.accessingdatajpa.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    ProductRepository productRepository;

//    @Autowired //Dependency Injection
//    public ProductDAOImpl(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        return productRepository.save(product);
    }

    @Override
    public ProductEntity getProduct(String productId) {
        return productRepository.getReferenceById(productId);
    }
}
