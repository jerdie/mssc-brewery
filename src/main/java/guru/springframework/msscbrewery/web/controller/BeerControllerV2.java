package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.BeerServiceV2;
import guru.springframework.msscbrewery.web.model.BeerDtoV2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
@RequiredArgsConstructor
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDtoV2> createBeer(@Valid @RequestBody BeerDtoV2 BeerDtoV2) {
        BeerDtoV2 createdBeer = beerService.createNewBeer(BeerDtoV2);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + createdBeer.getId());
        return new ResponseEntity<>(createdBeer, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> updateBeer(@PathVariable UUID beerId, @Valid @RequestBody BeerDtoV2 BeerDtoV2) {
        beerService.updateBeer(beerId, BeerDtoV2);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId) {
        beerService.deleteBeer(beerId);
    }

}
