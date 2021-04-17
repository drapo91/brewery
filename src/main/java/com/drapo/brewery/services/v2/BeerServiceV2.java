package com.drapo.brewery.services.v2;

import com.drapo.brewery.web.model.BeerDto;
import com.drapo.brewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerServiceV2 {
    public BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDtoV2 beer);

    void update(UUID beerId, BeerDtoV2 beer);

    void removeById(UUID beerId);
}
