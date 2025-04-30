package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, String> {

}
