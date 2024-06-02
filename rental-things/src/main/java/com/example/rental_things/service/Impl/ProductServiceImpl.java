package com.example.rental_things.service.Impl;

import com.example.rental_things.models.Product;
import com.example.rental_things.repository.ProductRepo;
import com.example.rental_things.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {


    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }



    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }
}
