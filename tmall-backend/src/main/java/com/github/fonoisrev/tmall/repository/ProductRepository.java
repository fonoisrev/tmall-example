package com.github.fonoisrev.tmall.repository;

import com.github.fonoisrev.tmall.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
    public Product findByName(String productName);
}
