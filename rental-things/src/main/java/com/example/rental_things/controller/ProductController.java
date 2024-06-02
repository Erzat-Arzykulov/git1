package com.example.rental_things.controller;

import com.example.rental_things.models.Product;
import com.example.rental_things.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;



    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        Product productSaved = productService.save(product);

        if (productSaved == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }else {
            return ResponseEntity.ok(product);
        }
    }





}
