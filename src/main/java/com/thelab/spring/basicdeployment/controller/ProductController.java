package com.thelab.spring.basicdeployment.controller;

import com.thelab.spring.basicdeployment.Service.ProductService;
import com.thelab.spring.basicdeployment.entity.Product;
import com.thelab.spring.basicdeployment.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product product = productService.findById(id);
        if (product != null) {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            return productService.save(product);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
