package com.example.rental_things.repository;

import com.example.rental_things.models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepo extends JpaRepository<Clients, Long> {
}
