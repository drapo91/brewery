package com.drapo.brewery.services;

import com.drapo.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    public BeerDto getBeerById(UUID beerId);
}
