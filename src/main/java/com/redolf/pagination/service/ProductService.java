package com.redolf.pagination.service;

import com.redolf.pagination.model.Product;
import com.redolf.pagination.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    final private ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Page<Product> getProductsWithPageSize(int pageSize){
        return productRepository.findAll(Pageable.ofSize(pageSize));
    }

    public Page<Product> getProductsWithOffsetAndPageSize(int offset, int pageSize){
        return productRepository.findAll(PageRequest.of(offset,pageSize));
    }

    public List<Product> getProductsWithFieldSort(String field){
        return productRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION.ASC, field));
    }
}
