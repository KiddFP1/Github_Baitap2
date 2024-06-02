package com.poly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.dao.ProductDAO;
import com.poly.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

	public Product getProduct(Long id) {
		return productDAO.findById(id).orElse(null);
	}

	public List<Product> getAllProducts() {
		return productDAO.findAll();
	}
}
