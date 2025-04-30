package com.api.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Products;
import com.api.entity.Quantitydiscounts;
import com.api.repository.ProductRepository;
import com.api.repository.QuantitydiscountsRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	@Autowired
	QuantitydiscountsRepository quantitydiscountsRepository;
	@Override
	public List priceCalculation(String productId, int quantity, String promoCode, String userType) {
    Optional<Products> product=productRepository.findById(productId);
	Products originalProduct=product.get();
	Float originalPrice =originalProduct.getBasePrice();
	 List result=new LinkedList<>();
	 result.add(productId);
	 result.add(originalPrice);
	 Optional<Quantitydiscounts> quantitydiscount=quantitydiscountsRepository.findByMinQuantity(quantity);
	 Quantitydiscounts originalquant=quantitydiscount.get();
		Float discount =originalquant.getDiscountPercentage();
	 float finalPrice=originalPrice-(originalPrice*discount)/100;
	 result.add(finalPrice);
		return result;
	}

}
