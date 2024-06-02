package com.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.main.Entity.Account;

@EnableJpaRepositories
@Repository
public interface AccountDAO extends JpaRepository<Account, String> {
}
