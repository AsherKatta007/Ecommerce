package com.scaler.backendproject.service;

import com.scaler.backendproject.dto.FakeStoreProductDTO;
import com.scaler.backendproject.exceptions.ProductNotFoundException;
import com.scaler.backendproject.models.Category;
import com.scaler.backendproject.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//This annotation here is going to tell SpringBoot
//that this is one of our important class
//so create an object of this
@Service("fakeStoreProductService")
public class FakeStoreProductService {
}
