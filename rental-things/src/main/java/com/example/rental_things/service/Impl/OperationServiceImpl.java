package com.example.rental_things.service.Impl;

import com.example.rental_things.models.Operation;
import com.example.rental_things.repository.OperationRepo;
import com.example.rental_things.service.OperationService;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {



    private final OperationRepo operationRepo;

    public OperationServiceImpl(OperationRepo operationRepo) {
        this.operationRepo = operationRepo;
    }


    @Override
    public Operation save(Operation operation) {
        return operationRepo.save(operation);
    }
}
