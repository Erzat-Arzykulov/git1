package com.example.rental_things.controller;

import com.example.rental_things.models.OperationProducts;
import com.example.rental_things.service.OperationProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/operation_product")
@AllArgsConstructor
public class OperationProductController {


    private OperationProductService operationProductService;


    @PostMapping("/save")
    public ResponseEntity<OperationProducts> saveOperationProduct(@RequestBody OperationProducts operationProducts){
        OperationProducts operationProductsSaved = operationProductService.save(operationProducts);

        if (operationProductsSaved == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }else {
            return ResponseEntity.ok(operationProducts);
        }


    }











}
