package conference.rest.impl;

import conference.core.entity.Room;
import conference.dto.RoomDto;
import conference.dto.ScheduleDto;
import conference.rest.RoomRest;
import conference.service.RoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class RoomRestImpl implements RoomRest {


    private final RoomService roomService;

    public RoomRestImpl(RoomService roomService) {
        this.roomService = roomService;
    }


    @Override
    public ResponseEntity<Room> getById(UUID id) {
        return null;
    }

    @Override
    public void addRoom(Room room) {

    }

    @Override
    public ResponseEntity<RoomDto> linkToSchedule(UUID roomID, UUID scheduleID) {
        Room room = roomService.roomLinkSchedule(roomID, scheduleID);

        RoomDto roomDto = RoomDto.builder()
                .ID(room.getID())
                .numberRoom(room.getNumberRoom())
                .maxPlace(room.getMaxPlace())
                .squareRoom(room.getSquareRoom())
                .isVideoProjector(room.getIsVideoProjector())
                .scheduleDtos(List.of(
                        ScheduleDto.builder()
                                .ID(room.getSchedules().get(0).getID())
                                .startSchedule(room.getSchedules().get(0).getStartSchedule())
                                .endSchedule(room.getSchedules().get(0).getEndSchedule())
                                .numberRoom(room.getSchedules().get(0).getNumberRoom())
                                .PresentationID(room.getSchedules().get(0).getPresentationID())
                                .build()
                ))

                .build();

        return ResponseEntity.ok(roomDto);

    }
}
