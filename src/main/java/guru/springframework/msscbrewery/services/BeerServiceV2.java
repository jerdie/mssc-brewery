package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDtoV2;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 createNewBeer(BeerDtoV2 beerDto);
    void updateBeer(UUID beerId, BeerDtoV2 beerDto);
    void deleteBeer(UUID beerId);
}
