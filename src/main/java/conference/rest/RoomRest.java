package conference.rest;

import conference.core.entity.Room;
import conference.dto.RoomDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping
public interface RoomRest {

    @GetMapping("/api/room/{id}")
    ResponseEntity<Room> getById(@PathVariable("id") UUID id);

    @PostMapping("/api/room/")
    void addRoom(@RequestBody Room room);

    @PutMapping("/api/room/{roomID}/link-to-schedule/{scheduleID}")
    ResponseEntity<RoomDto> linkToSchedule(@PathVariable UUID roomID, @PathVariable UUID scheduleID);

}
