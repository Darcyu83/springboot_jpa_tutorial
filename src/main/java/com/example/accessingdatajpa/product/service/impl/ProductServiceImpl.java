package com.example.accessingdatajpa.product.service.impl;

import com.example.accessingdatajpa.product.entity.ProductEntity;
import com.example.accessingdatajpa.product.handler.ProductDataHandler;
import com.example.accessingdatajpa.product.service.ProductService;
import com.example.accessingdatajpa.product.vo.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDataHandler productHandler;

//    @Autowired
//    public ProductServiceImpl(ProductDataHandler productHandler) {
//        this.productHandler = productHandler;
//    }

    @Override
    public ProductDTO getProduct(String productId) {
        return productHandler.getProductEntity(productId).toDTO();
    }

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {

        ProductEntity productEntity = productDTO.toEntity();

        return productHandler.saveProductEntity(productEntity).toDTO();

    }
}
