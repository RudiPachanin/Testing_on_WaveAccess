package conference.repository;

import conference.core.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Schedule extends JpaRepository<Room, UUID> {
}
