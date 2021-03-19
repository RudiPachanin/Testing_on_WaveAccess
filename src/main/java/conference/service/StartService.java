package conference.service;

import conference.core.entity.Room;
import conference.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class StartService {

    private final RoomRepository roomRepository;

    @PostConstruct
    public void start() {
        roomRepository.save(Room.builder()
                .maxPlace(5)
                .numberRoom(1)
                .isVideoProjector(false)
                .squareRoom(30)
                .build());

        roomRepository.save(Room.builder()
                .maxPlace(15)
                .numberRoom(2)
                .isVideoProjector(true)
                .squareRoom(60)
                .build());

        roomRepository.save(Room.builder()
                .maxPlace(50)
                .numberRoom(3)
                .isVideoProjector(true)
                .squareRoom(180)
                .build());
    }
}
