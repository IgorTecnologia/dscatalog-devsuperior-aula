package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {

	public static Product createdProduct() {
		
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2024-04-10T12:55:00Z"));
		product.getCategories().add(new Category(1L, "Electronics"));
		return product;
		
	}
	
	public static ProductDTO createProductDTO() {
		
		Product product = createdProduct();
		return new ProductDTO(product, product.getCategories());
	}
}
