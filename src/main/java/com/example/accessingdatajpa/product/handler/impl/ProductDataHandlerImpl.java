package com.example.accessingdatajpa.product.handler.impl;

import com.example.accessingdatajpa.product.dao.ProductDAO;
import com.example.accessingdatajpa.product.entity.ProductEntity;
import com.example.accessingdatajpa.product.handler.ProductDataHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {

    ProductDAO productDAO;

    public ProductDataHandlerImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public ProductEntity saveProductEntity(ProductEntity productEntity) {
        return productDAO.saveProduct(productEntity);
    }

    @Override
    public ProductEntity getProductEntity(String productId) {
        return productDAO.getProduct(productId);
    }
}
