package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.GOSE)
                .build();
    }

    @Override
    public BeerDtoV2 createNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerID, BeerDtoV2 beerDto) {
        //todo
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleted {}", beerId);
    }
}
