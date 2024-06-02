package com.example.rental_things.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter

@Entity
@Table(name = "documents")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Documents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int passportSeries;

    int passportNumber;

    @ManyToOne
    @JoinTable(
            name = "client",
            joinColumns = @JoinColumn(name = "document_id")
    )
    Documents documents;


    // @ManyToOne
    //    @JoinTable(
    //            name = "operation",
    //            joinColumns = @JoinColumn(name = "id_client")
    //    )
    //    private Clients clients;


}
