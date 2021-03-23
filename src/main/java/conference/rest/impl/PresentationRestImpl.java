package conference.rest.impl;

import conference.core.entity.Presentation;
import conference.dto.PresentationDto;
import conference.dto.ScheduleDto;
import conference.rest.PresentationRest;
import conference.service.PresentationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
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

    @Override
    public ResponseEntity<PresentationDto> linkToSchedule(UUID presentationID, UUID scheduleID){
        Presentation presentation = presentationService.presentationLinkSchedule(presentationID,scheduleID);

        PresentationDto presentationDto= PresentationDto.builder()
                .ID(presentation.getID())
                .name(presentation.getName())
                .startDate(presentation.getStartDate())
                .endDate(presentation.getEndDate())
                .createData(presentation.getCreateData())
                .countPage(presentation.getCountPage())
                .scheduleDtos(List.of(
                        ScheduleDto.builder()
                                .ID(presentation.getSchedules().getID())
                                .startSchedule(presentation.getSchedules().getStartSchedule())
                                .endSchedule(presentation.getSchedules().getEndSchedule())
                                .numberRoom(presentation.getSchedules().getNumberRoom())
                                .PresentationID(presentation.getSchedules().getPresentationID())
                                .build()
                ))
                .build();
        return ResponseEntity.ok(presentationDto);

    }
}
