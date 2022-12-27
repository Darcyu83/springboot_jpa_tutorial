package com.example.accessingdatajpa.product.entity;

import com.example.accessingdatajpa.product.vo.ProductDTO;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="product")
public class ProductEntity {

    @Id
    String productId;
    String productName;
    int productPrice;
    int productStock;


    public ProductDTO toDTO (){
        return ProductDTO.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();

    }




}
