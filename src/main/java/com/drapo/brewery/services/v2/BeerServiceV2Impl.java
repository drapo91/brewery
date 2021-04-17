package com.drapo.brewery.services.v2;

import com.drapo.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveBeer(BeerDto beer) {
        return null;
    }

    @Override
    public void update(UUID beerId, BeerDto beer) {

    }

    @Override
    public void removeById(UUID beerId) {

    }
}
