package com.example.accessingdatajpa.product.controller;

import com.example.accessingdatajpa.HomeController;
import com.example.accessingdatajpa.product.service.ProductService;
import com.example.accessingdatajpa.product.vo.ProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(ProductController.class);


    @Autowired
    private ProductService productService;



//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/{productId}")
    public ProductDTO getProduct(@PathVariable String productId) {
        return productService.getProduct(productId);
    }

    @PostMapping("/save")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO) {
        return productService.saveProduct(productDTO);
    }


}
