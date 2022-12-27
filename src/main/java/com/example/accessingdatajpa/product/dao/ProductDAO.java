package com.example.accessingdatajpa.product.dao;

import com.example.accessingdatajpa.product.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct (ProductEntity product);

    ProductEntity getProduct(String productId);

}
