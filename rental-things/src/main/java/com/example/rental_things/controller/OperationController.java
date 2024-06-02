package com.example.rental_things.controller;

import com.example.rental_things.models.Operation;
import com.example.rental_things.service.OperationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/operation")
@AllArgsConstructor
public class OperationController {


    private OperationService operationService;


    @PostMapping("/save")
    private ResponseEntity<Operation> saveOperation(@RequestBody Operation operation){
        Operation operationSaved = operationService.save(operation);

        if (operationSaved == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }else {
            return ResponseEntity.ok(operation);
        }

    }






}
