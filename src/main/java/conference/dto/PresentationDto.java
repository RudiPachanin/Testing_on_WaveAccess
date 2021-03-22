package conference.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PresentationDto {

    private UUID ID;

    private String name;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private ZonedDateTime createData;

    private Integer countPage;


}
