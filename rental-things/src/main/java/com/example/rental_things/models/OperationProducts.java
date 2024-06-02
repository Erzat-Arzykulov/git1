package com.example.rental_things.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter

@Entity
@Table(name = "operation_products")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OperationProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;







    Long id_operation;





    Long id_product;





}
