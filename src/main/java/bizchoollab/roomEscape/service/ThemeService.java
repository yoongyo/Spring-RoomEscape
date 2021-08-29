package bizchoollab.roomEscape.service;


import bizchoollab.roomEscape.entity.Theme;
import bizchoollab.roomEscape.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThemeService {

    private final ThemeRepository themeRepository;


    public List<Theme> themes(String roomEscape_name) {
        return themeRepository.findByRoomEscapeName(roomEscape_name);
    }
}
