package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Products;
import com.api.entity.Quantitydiscounts;

public interface QuantitydiscountsRepository extends JpaRepository<Quantitydiscounts, Integer> {

}
