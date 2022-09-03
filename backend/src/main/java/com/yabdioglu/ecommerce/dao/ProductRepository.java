package com.yabdioglu.ecommerce.dao;

import com.yabdioglu.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
