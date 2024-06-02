package com.example.rental_things.service;

import com.example.rental_things.models.Operation;
import com.example.rental_things.models.dto.RentalDto;

public interface RentalService {
    Operation save(RentalDto rentalDto);
}
