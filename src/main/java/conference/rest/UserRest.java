package conference.rest;

import conference.core.entity.User;
import conference.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping
public interface UserRest {

    @GetMapping("/api/user/{id}")
    ResponseEntity<User> getById(@PathVariable("id") UUID id);

    @PostMapping("/api/user/")
    ResponseEntity<User> addUser(@RequestBody User user);

    @PutMapping("/api/user/{userID}/link-to-presentation/{presentationID}")
    ResponseEntity<UserDto> linkToPresentation(@PathVariable UUID userID, @PathVariable UUID presentationID);

}
