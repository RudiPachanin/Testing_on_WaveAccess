package conference.rest.impl;

import conference.core.entity.Presentation;
import conference.rest.PresentationRest;
import conference.service.PresentationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class PresentationRestImpl implements PresentationRest {

    private final PresentationService presentationService;

    @Override
    public ResponseEntity<Presentation> getById(UUID id) {
        return null;
    }

    @Override
    public void addPresentation(Presentation presentation) {
        presentationService.savePresentation(presentation);
    }


}
