package conference.rest;

import conference.core.entity.Presentation;
import conference.dto.PresentationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping
public interface PresentationRest {

    @GetMapping("/api/presentation/{id}")
    ResponseEntity<Presentation> getById(@PathVariable("id") UUID id);

    @PostMapping("/api/presentation/")
    void addPresentation(@RequestBody Presentation presentation);

    @PutMapping("/api/presentation/{presentationID}/link-to-schedule/{scheduleID}")
    ResponseEntity<PresentationDto> linkToSchedule(@PathVariable("presentationID") UUID presentationID,@PathVariable("scheduleID") UUID scheduleID);
}
