package conference.dto;

import conference.core.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomDto {

    private UUID ID;

    private Integer numberRoom;

    private Integer maxPlace;

    private Integer squareRoom;

    private Boolean isVideoProjector;

    private List<ScheduleDto>scheduleDtos;
}
