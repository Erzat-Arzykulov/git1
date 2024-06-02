package com.example.rental_things.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter

@Entity
@Table(name = "client")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String firstName;

    String lastName;

    String patronymic;

    Long inn;

    Long document_id;

    String address;

    @ManyToOne
    @JoinTable(
            name = "operation",
            joinColumns = @JoinColumn(name = "id_client")
    )
    private Clients clients;




}
