package com.example.redis.sg.controller;

import com.example.redis.sg.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= {"/api", "/api1"})
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
        System.out.println(" -- hotfix change -- ");
        System.out.println(" -- controller -- ");
        System.out.println(" -- master test -- ");
        System.out.println(" -- my controller -- ");
        return "Sagar";
    }
}
