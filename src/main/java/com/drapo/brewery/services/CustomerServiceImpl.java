package com.drapo.brewery.services;

import com.drapo.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Anetka")
                .build();
    }

    @Override
    public CustomerDto save(CustomerDto customer) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Anetka")
                .build();
    }

    @Override
    public void update(UUID customerId, CustomerDto customer) {
        //todo make implementation
    }

    @Override
    public void remove(UUID customerId) {
        log.debug("Deleting a customer...");
        System.out.println("Deleting a customer...");
    }
}
