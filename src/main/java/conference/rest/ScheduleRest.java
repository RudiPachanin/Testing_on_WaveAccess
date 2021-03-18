package conference.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping
public interface ScheduleRest {

    @GetMapping("/api/schedule/{id}")
    ResponseEntity<conference.core.entity.Schedule> getById(@PathVariable("id") UUID id);

    @PostMapping("/api/schedule/")
    void addSchedule(@RequestBody conference.core.entity.Schedule schedule);
}
