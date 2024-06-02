package com.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.main.Entity.Order;

@EnableJpaRepositories
@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {

}
