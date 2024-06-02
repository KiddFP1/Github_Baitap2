package com.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.main.Entity.Product;

@EnableJpaRepositories
@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}
