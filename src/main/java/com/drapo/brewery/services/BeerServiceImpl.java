package com.drapo.brewery.services;

import com.drapo.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Kasztelan")
                .beerStyle("Pale Ale")
                .build();
    }
}