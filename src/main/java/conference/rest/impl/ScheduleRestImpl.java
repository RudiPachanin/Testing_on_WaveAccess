package conference.rest.impl;

import conference.core.entity.Schedule;
import conference.rest.ScheduleRest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ScheduleRestImpl implements ScheduleRest {

    @Override
    public ResponseEntity<Schedule> getById(UUID id) {
        return null;
    }

    @Override
    public void addSchedule(Schedule schedule) {

    }
}
