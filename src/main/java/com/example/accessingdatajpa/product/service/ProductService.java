package com.example.accessingdatajpa.product.service;

import com.example.accessingdatajpa.product.vo.ProductDTO;

public interface ProductService {


    ProductDTO getProduct(String productId);

    ProductDTO saveProduct(ProductDTO productDTO);
}
