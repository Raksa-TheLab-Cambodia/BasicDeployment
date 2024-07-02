package com.thelab.spring.basicdeployment.repository;

import com.thelab.spring.basicdeployment.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {}
