package bizchoollab.roomEscape.service;


import bizchoollab.roomEscape.entity.RoomEscape;
import bizchoollab.roomEscape.repository.RoomEscapeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomEscapeService {

    private final RoomEscapeRepository roomEscapeRepository;

    public Optional<RoomEscape> roomEscape(String name) {
        return roomEscapeRepository.findByName(name);
    }
}
