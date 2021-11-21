package guru.springframework.msscbrewery.domain;

import guru.springframework.msscbrewery.web.model.BeerStyle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;

    private Timestamp createDate;
    private Timestamp updateDate;
}
