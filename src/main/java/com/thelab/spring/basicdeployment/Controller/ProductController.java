package com.thelab.spring.basicdeployment.Controller;

import com.thelab.spring.basicdeployment.Entity.Product;
import com.thelab.spring.basicdeployment.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

//    @PutMapping("/{id}")
//    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
//        Product product = productRepository.findById(id).orElse(null);
//        if (product != null) {
//            product.setName(productDetails.getName());
//            product.setPrice(productDetails.getPrice());
//            return productRepository.save(product);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteProduct(@PathVariable Long id) {
//        productRepository.deleteById(id);
//    }
}
