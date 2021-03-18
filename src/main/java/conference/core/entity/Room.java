package conference.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

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
}
