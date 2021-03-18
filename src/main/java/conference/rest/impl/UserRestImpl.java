package conference.rest.impl;

import conference.core.entity.User;
import conference.rest.UserRest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserRestImpl implements UserRest {

    @Override
    public ResponseEntity<User> getById(UUID id) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }
}
