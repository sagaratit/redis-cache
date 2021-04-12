package com.example.redis.sg.service;

import com.example.redis.sg.domain.Customer;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"Customer"})
public class CustomerService {

    @Cacheable(key="#id")
    public Customer getCustomerInfo(Long id) {
        System.out.println("Load form DB");
        return new Customer("Sagar",id,"Satara");
    }
}
