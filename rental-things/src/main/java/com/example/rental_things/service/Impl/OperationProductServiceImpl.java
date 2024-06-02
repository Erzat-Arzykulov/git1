package com.example.rental_things.service.Impl;

import com.example.rental_things.models.OperationProducts;
import com.example.rental_things.repository.OperationProductsRepo;
import com.example.rental_things.service.OperationProductService;
import org.springframework.stereotype.Service;

@Service
public class OperationProductServiceImpl implements OperationProductService {


    private final OperationProductsRepo operationProductsRepo;

    public OperationProductServiceImpl(OperationProductsRepo operationProductsRepo) {
        this.operationProductsRepo = operationProductsRepo;
    }


    @Override
    public OperationProducts save(OperationProducts operationProducts) {
        return operationProductsRepo.save(operationProducts);
    }
}
