package com.api.service;

import java.util.List;

public interface ProductService{

	List priceCalculation(String productId, int quantity, String promoCode, String userType);

}
