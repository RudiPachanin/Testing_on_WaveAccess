package conference.rest.impl;

import conference.core.entity.Schedule;
import conference.rest.ScheduleRest;
import conference.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class ScheduleRestImpl implements ScheduleRest {

    private final  ScheduleService ScheduleService;

    @Override
    public ResponseEntity<Schedule> getById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<Schedule> addSchedule(Schedule schedule) {
        return ResponseEntity.ok(ScheduleService.saveSchedule(schedule));
    }
}
