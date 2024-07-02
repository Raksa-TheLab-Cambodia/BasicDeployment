package com.thelab.spring.basicdeployment.Service;

import com.thelab.spring.basicdeployment.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
}
