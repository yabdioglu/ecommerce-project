package com.yabdioglu.ecommerce.dao;

import com.yabdioglu.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
    // Spring Data REST automatically exposes endpoint -> http://localhost:8080/api/products/search/findByCategoryId?id=2

    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}
