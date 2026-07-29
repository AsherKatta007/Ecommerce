package com.scaler.backendproject.service;

import com.scaler.backendproject.dto.FakeStoreProductDTO;
import com.scaler.backendproject.exceptions.CategoryNotFoundException;
import com.scaler.backendproject.models.Category;
import com.scaler.backendproject.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service("fakeStoreCategoryService")
public class FakeStoreCategoryService  implements CategoryService{

}
