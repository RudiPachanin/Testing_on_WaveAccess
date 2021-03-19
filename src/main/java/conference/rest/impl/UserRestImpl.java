package conference.rest.impl;

import conference.core.entity.User;
import conference.rest.UserRest;
import conference.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

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


}
