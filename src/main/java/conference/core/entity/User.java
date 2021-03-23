package conference.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_t")
public class User {

    @Id
    @GeneratedValue
    private UUID ID;

    private String firstName;

    private String lastName;

    private Integer age;

    private String login;

    private String password;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @ManyToMany
    @JoinTable(name = "presentation_user",
            joinColumns = @JoinColumn(name = "user_ID"),
            inverseJoinColumns = @JoinColumn(name = "presentation_ID"))
    private List<Presentation> presentations = new ArrayList<>();
}
