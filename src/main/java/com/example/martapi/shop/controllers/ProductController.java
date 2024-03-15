package com.example.martapi.shop.controllers;

import com.example.martapi.shop.models.Product;
import com.example.martapi.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String getHome(){
        return new String("<h1>Welcome Home</h1>");
    }

    @PostMapping(path="/products")
    public @ResponseBody ResponseEntity<String> addProducts(@RequestBody  Product product){
        //Product newProduct = new Product("New iPhone 2023");
        productRepository.save(product);
        return new ResponseEntity<>("Product created successfully",
                HttpStatus.OK);
    }

    @GetMapping(path="/products")
    public @ResponseBody Iterable<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/home")
    public List<Product> getProductList(){
        Iterable<Product> products = productRepository.findAll();
        List<Product> productsList = new ArrayList<>();
        products.forEach(productsList::add);
        return productsList;
    }

    @GetMapping("all/products")
    public List<Product> getAllProducts(){
        Iterable<Product> products = productRepository.findAll();
        List<Product> productList = new ArrayList<>();
        products.forEach(productList::add);
        return productList;
    }
}
