package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Products;
import com.api.entity.PromoCodes;

public interface PromoCodesRepository extends JpaRepository<PromoCodes, String>{

}
