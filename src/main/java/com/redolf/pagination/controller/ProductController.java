package com.redolf.pagination.controller;

import com.redolf.pagination.model.Product;
import com.redolf.pagination.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/save")
    private Product savedProduct(@RequestBody Product product){
        return service.createProduct(product);
    }

    @GetMapping("/{pageSize}")
    private Page<Product> getProductsWithPageSize(@PathVariable int pageSize){
        return service.getProductsWithPageSize(pageSize);
    }

    @GetMapping("/{offset}/{pageSize}")
    private Page<Product> getProductsWithOffsetAndPageSize(@PathVariable int offset ,@PathVariable int pageSize){
        return service.getProductsWithOffsetAndPageSize(offset, pageSize);
    }

    @GetMapping("/sort/{field}")
    private List<Product> getProductsWithFieldSort(@PathVariable String field){
        return service.getProductsWithFieldSort(field);
    }

}
