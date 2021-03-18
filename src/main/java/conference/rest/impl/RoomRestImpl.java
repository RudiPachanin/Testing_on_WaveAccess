package conference.rest.impl;

import conference.core.entity.Room;
import conference.rest.RoomRest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RoomRestImpl implements RoomRest {

    @Override
    public ResponseEntity<Room> getById(UUID id) {
        return null;
    }

    @Override
    public void addRoom(Room room) {

    }
}
