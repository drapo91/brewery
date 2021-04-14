package com.drapo.brewery.services.v2;

import com.drapo.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerServiceV2 {
    public BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beer);

    void update(UUID beerId, BeerDto beer);

    void removeById(UUID beerId);
}
