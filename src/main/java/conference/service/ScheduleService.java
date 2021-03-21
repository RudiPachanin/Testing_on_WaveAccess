package conference.service;


import conference.core.entity.Schedule;
import conference.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public conference.core.entity.Schedule  saveSchedule(conference.core.entity.Schedule schedule){
        Schedule save = scheduleRepository.save(schedule);
        return save;
    }

}
