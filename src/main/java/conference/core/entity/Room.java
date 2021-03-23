package conference.core.entity;

import conference.dto.ScheduleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room_t")
public class Room {

    @Id
    @GeneratedValue
    private UUID ID;

    private Integer numberRoom;

    private Integer maxPlace;

    private Integer squareRoom;

    private Boolean isVideoProjector;

    @OneToMany
    private List<Presentation> presentations;

    @ManyToMany
    @JoinTable(name = "room_schedule",
            joinColumns = @JoinColumn(name = "room_ID"),
            inverseJoinColumns = @JoinColumn(name = "schedule_ID"))
    private List<Schedule> schedules = new ArrayList<>();
}
