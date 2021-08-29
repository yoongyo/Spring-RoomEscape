package bizchoollab.roomEscape.repository;

import bizchoollab.roomEscape.entity.RoomEscape;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomEscapeRepository extends JpaRepository<RoomEscape, Long> {
    Optional<RoomEscape> findByName(String name);
}
