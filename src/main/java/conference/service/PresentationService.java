package conference.service;

import conference.core.entity.Presentation;
import conference.repository.PresentationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PresentationService {

    private final PresentationRepository presentationRepository;

    public void savePresentation(Presentation presentation){
        presentationRepository.save(presentation);
    }
}
