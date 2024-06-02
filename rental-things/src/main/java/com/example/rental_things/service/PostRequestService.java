package com.example.rental_things.service;

import com.example.rental_things.models.dto.RentalDto;

public interface PostRequestService {

    RentalDto save(RentalDto rentalDto);
}
