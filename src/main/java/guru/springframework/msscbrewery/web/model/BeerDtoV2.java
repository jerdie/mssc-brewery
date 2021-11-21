package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotBlank
    private BeerStyle beerStyle;
    @Positive
    private Long upc;

    private OffsetDateTime createDate;
    private OffsetDateTime updateDate;
}
