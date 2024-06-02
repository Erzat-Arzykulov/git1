package com.example.rental_things.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RentalDto {



        @JsonProperty("last_name")
        String lastName;

        @JsonProperty("first_name")
        String firstName;

        @JsonProperty("patronymic")
        String patronymic;

        @JsonProperty("inn")
        Long inn;

        @JsonProperty("passport_series")
        int passportSeries;

        @JsonProperty("passport_number")
        int passportNumber;

        String address;

        @JsonProperty("inventory_number")
        int inventoryNumber;

        @JsonProperty("start_date")
        String startDate;

        @JsonProperty("end_date")
        String endDate;

}
