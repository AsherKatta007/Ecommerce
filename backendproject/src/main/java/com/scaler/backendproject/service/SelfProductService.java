package com.scaler.backendproject.service;

import com.scaler.backendproject.exceptions.ProductNotFoundException;
import com.scaler.backendproject.models.Category;
import com.scaler.backendproject.models.Product;
import com.scaler.backendproject.repository.CategoryRepository;
import com.scaler.backendproject.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("selfProductService")
public class SelfProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
}
