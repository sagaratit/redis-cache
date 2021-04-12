package com.example.redis.sg.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Customer implements Serializable {

    private String custName;
    private Long custId;
    private String city;

    public Customer(String custName, Long custId, String city) {
        this.custName = custName;
        this.custId = custId;
        this.city = city;
    }
}
