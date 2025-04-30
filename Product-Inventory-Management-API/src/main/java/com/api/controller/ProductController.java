package com.api.controller;

import com.api.ProductInventoryManagement;
import com.api.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	
	@PostMapping("api/products/price-calculation")
	public List priceCalculation(
			@RequestParam String productId,
			@RequestParam int quantity,
			@RequestParam String promoCode,
			@RequestParam String userType) {
		return productService.priceCalculation(productId,quantity,promoCode,userType);
	}
}
