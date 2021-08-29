package bizchoollab.roomEscape.repository;


import bizchoollab.roomEscape.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
    List<Theme> findByRoomEscapeName(String roomEscape_name);
}
