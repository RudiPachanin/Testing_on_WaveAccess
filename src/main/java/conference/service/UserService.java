package conference.service;

import conference.core.entity.User;
import conference.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User user) {
        User save = userRepository.save(user);
        return save;

    }

    public User findById(UUID id) {
        User user=userRepository.findById(id).get();
        return user;
    }
}
