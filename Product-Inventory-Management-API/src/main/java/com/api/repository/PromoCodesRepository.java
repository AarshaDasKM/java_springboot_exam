package com.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Products;
import com.api.entity.PromoCodes;
import com.api.entity.Quantitydiscounts;

public interface PromoCodesRepository extends JpaRepository<PromoCodes, String>{

	Optional<Quantitydiscounts> findBydiscountPercentage(int quantity);

	Optional<Quantitydiscounts> findByCode(String promoCode);

}
