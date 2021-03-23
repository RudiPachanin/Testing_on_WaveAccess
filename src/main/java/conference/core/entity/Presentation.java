package conference.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "presentation_t")
public class Presentation {

    @Id
    @GeneratedValue
    private UUID ID;

    private String name;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private ZonedDateTime createData;

    private Integer countPage;

    @ManyToOne
    @JoinColumn(name = "room_ID")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "schedule_ID")
    private Schedule schedules;

    @ManyToMany
    @JoinTable(name = "presentation_user",
            joinColumns = @JoinColumn(name = "presentation_ID"),
            inverseJoinColumns = @JoinColumn(name = "user_ID"))
    private List<User> users;



}
