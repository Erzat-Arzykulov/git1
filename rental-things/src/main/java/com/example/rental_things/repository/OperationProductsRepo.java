package com.example.rental_things.repository;

import com.example.rental_things.models.OperationProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationProductsRepo extends JpaRepository<OperationProducts, Integer> {
}
