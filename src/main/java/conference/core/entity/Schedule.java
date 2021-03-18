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
@Table(name = "schedule_t")
public class Schedule {

    @Id
    @GeneratedValue
    private UUID ID;

    private ZonedDateTime timestamp;

    @OneToMany
    private List<Presentation> presentations;
}
