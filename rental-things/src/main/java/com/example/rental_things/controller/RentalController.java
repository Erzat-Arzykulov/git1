package com.example.rental_things.controller;

import com.example.rental_things.models.Operation;
import com.example.rental_things.models.dto.RentalDto;
import com.example.rental_things.service.Impl.RentalServiceImpl;
import com.example.rental_things.service.RentalService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rental")
@AllArgsConstructor
public class RentalController {


    private RentalService rentalService;


    @PostMapping(value = "/createOperation")
    public ResponseEntity<Operation> createRental(@RequestBody RentalDto rentalDto) {
        Operation operation = rentalService.save(rentalDto);
        return ResponseEntity.ok(operation);
    }
}
