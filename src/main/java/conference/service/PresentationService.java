package conference.service;

import conference.core.entity.Presentation;
import conference.core.entity.Schedule;
import conference.repository.PresentationRepository;
import conference.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PresentationService {

    private final PresentationRepository presentationRepository;
    private final ScheduleRepository scheduleRepository;

    public void savePresentation(Presentation presentation) {
        presentationRepository.save(presentation);
    }

    public Presentation presentationLinkSchedule(UUID presentationID, UUID scheduleID) {
        Presentation presentation = presentationRepository.findById(presentationID).get();
        Schedule schedule = scheduleRepository.findById(scheduleID).get();

        for (int i = 0; i < schedule.getPresentations().size(); i++) {
            Presentation presentation1 = schedule.getPresentations().get(i);
            Duration duration = Duration.between(presentation.getStartDate(), presentation.getEndDate());
            ZonedDateTime zonedDateTime = presentation1.getStartDate().plus(duration);

            if (zonedDateTime.isBefore(presentation.getStartDate())) {
            return presentation;
            }
        }

        presentation.setSchedules(schedule);

        return presentationRepository.save(presentation);
    }


}
