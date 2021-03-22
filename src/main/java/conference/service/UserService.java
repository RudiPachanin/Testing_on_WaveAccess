package conference.service;

import conference.core.entity.Presentation;
import conference.core.entity.User;
import conference.repository.PresentationRepository;
import conference.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PresentationRepository presentationRepository;

    public User createUser(User user) {
        User save = userRepository.save(user);
        return save;

    }

    public User findById(UUID id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    public User userLinkPresentation(UUID userID, UUID presentationID) {
        User user = userRepository.findById(userID).get();
        Presentation presentation = presentationRepository.findById(presentationID).get();

        user.getPresentations().add(presentation);

        return userRepository.save(user);
    }
}
