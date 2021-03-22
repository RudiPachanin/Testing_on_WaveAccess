package conference.dto;

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
public class UserDto {

    private UUID ID;

    private String firstName;

    private String lastName;

    private Integer age;

    private String login;

    private String password;

    private List<PresentationDto>presentationDtos;
}
