package conference.service;

import conference.core.entity.Room;
import conference.core.entity.Schedule;
import conference.repository.RoomRepository;
import conference.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;
    private final ScheduleRepository scheduleRepository;

    public Room roomLinkSchedule(UUID roomID, UUID scheduleID) {
        Room room = roomRepository.findById(roomID).get();
        Schedule schedule = scheduleRepository.findById(scheduleID).get();

        room.getSchedules().add(schedule);

        return roomRepository.save(room);

    }
}
