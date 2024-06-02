package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.model.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {
}
