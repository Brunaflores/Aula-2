package com.bruna.controllers;

import com.bruna.entities.Product;
import com.bruna.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String get() {
        return "GET todos os produtos";
    }

    @GetMapping("{id}")
    public String getId() {
        return "GET produto por id";
    }

    @PostMapping
    public Product post(@RequestBody Product product) throws Exception {
        return productService.save(product);
    }

    @PutMapping
    public String put(Product product) {
        return "PUT produto";
    }

    @DeleteMapping("{id}")
    public String delete() {
        return "DELETE produto por id";
    }

}
