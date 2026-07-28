package com.scaler.backendproject.service;

import com.scaler.backendproject.models.Category;
import com.scaler.backendproject.models.Product;
import com.scaler.backendproject.repository.CategoryRepository;
import com.scaler.backendproject.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service("selfCategoryService")
public class SelfCategoryService implements CategoryService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfCategoryService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }