package com.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.Entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String> {
}
