package com.thelab.spring.basicdeployment;

import com.thelab.spring.basicdeployment.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {}
