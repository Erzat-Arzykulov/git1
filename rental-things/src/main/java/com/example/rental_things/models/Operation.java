package com.example.rental_things.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "operation")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String startDate;

    String endDate;

    int status;

    Long id_client;

    double totalPrice;


    @ManyToMany
    @JoinTable(
            name = "operation_products",
            joinColumns = @JoinColumn(name = "id_operation"),
            inverseJoinColumns = @JoinColumn(name =  "id_product")
    )
    private List<Product> products;



}






//@Entity
//class Operation{
//	@Id
//	private Long id;
//
//	@ManyToMany
//	@JoinTable(
//		name = "operation_products",
//		joinColumns = @JoinColumn(name = "operation_id"),
//		inverseJoinColumns = @JoinColumn(name = "product_id")
//	)
//	private List<Product> products;
//}


















