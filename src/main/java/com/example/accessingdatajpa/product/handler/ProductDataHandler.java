package com.example.accessingdatajpa.product.handler;

import com.example.accessingdatajpa.product.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(ProductEntity productEntity);

    ProductEntity getProductEntity(String productId);

}
