package conference.rest.impl;

import conference.core.entity.User;
import conference.dto.PresentationDto;
import conference.dto.UserDto;
import conference.rest.UserRest;
import conference.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class UserRestImpl implements UserRest {

    private final UserService userService;

    @Override
    public ResponseEntity<User> getById(UUID id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @Override
    public ResponseEntity<User> addUser(User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @Override
    public ResponseEntity<UserDto> linkToPresentation(UUID userID, UUID presentationID) {
        User user = userService.userLinkPresentation(userID, presentationID);

        UserDto userDto = UserDto.builder()
                .ID(user.getID())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .login(user.getLogin())
                .password(user.getPassword())
                .presentationDtos(List.of(
                        PresentationDto.builder()
                                .countPage(user.getPresentations().get(0).getCountPage())
                                .createData(user.getPresentations().get(0).getCreateData())
                                .endDate(user.getPresentations().get(0).getEndDate())
                                .ID(user.getPresentations().get(0).getID())
                                .name(user.getPresentations().get(0).getName())
                                .startDate(user.getPresentations().get(0).getStartDate())
                                .build()
                ))

                .build();

        return ResponseEntity.ok(userDto);

    }


}
