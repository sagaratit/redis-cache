package com.example.redis.sg.controller;

import com.example.redis.sg.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping(path = "/test/{id}")
    public void getCustomerData(@PathVariable Long id) {
        System.out.println(" -- getCustomerData -- ");
            customerService.getCustomerInfo(id);
    }

    @GetMapping("/test1")
    public String getCustomerDataNew() {
        System.out.println(" -- controller -- ");
        return "Sagar";
    }
}
