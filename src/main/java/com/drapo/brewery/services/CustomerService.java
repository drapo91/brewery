package com.drapo.brewery.services;

import com.drapo.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomerById(UUID id);

    CustomerDto save(CustomerDto customer);

    void update(UUID customerId, CustomerDto customer);

    void remove(UUID customerId);

}
