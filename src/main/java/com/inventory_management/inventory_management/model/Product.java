package com.inventory_management.inventory_management.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String productCategory;
    private String productName;
    private Long rating;
    private Long quality;
    private Long maximumProducts;
    private Long minimumProducts;
    private String userName;
    private String emailAddress;
    private Long phoneNumber;
}
