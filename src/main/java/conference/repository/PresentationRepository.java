package conference.repository;

import conference.core.entity.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PresentationRepository extends JpaRepository<Presentation, UUID> {

}
