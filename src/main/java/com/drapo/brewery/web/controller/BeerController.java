package com.drapo.brewery.web.controller;

import com.drapo.brewery.services.BeerService;
import com.drapo.brewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(@RequestBody BeerDto beer){
        BeerDto savedBeer = beerService.saveBeer(beer);

        HttpHeaders headers = new HttpHeaders();
        //TODO add hostname to url
        headers.add("Location", "/api/v1/beer/" + savedBeer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, BeerDto beer){
        beerService.update(beerId, beer);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
