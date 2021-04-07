package com.drapo.brewery.services;

import com.drapo.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomerById(UUID id);
}
