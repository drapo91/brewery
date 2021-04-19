package com.drapo.brewery.web.mappers;

import com.drapo.brewery.domain.Customer;
import com.drapo.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer CustomerDtoToCustomer(CustomerDto customerDto);
    CustomerDto CustomerToCustomerDto(Customer customer);
}
