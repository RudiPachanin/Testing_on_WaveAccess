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
public class ScheduleDto {

    private UUID ID;

    private ZonedDateTime startSchedule;

    private ZonedDateTime endSchedule;

    private Integer numberRoom;

    private UUID  PresentationID;
}
