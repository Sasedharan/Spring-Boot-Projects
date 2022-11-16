package com.em.springboot.Repository;

import com.em.springboot.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryInterface extends JpaRepository<Product, Integer> {

}
