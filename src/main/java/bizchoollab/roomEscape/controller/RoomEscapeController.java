package bizchoollab.roomEscape.controller;


import bizchoollab.roomEscape.entity.RoomEscape;
import bizchoollab.roomEscape.repository.RoomEscapeRepository;
import bizchoollab.roomEscape.service.RoomEscapeService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class RoomEscapeController {

    private final RoomEscapeService roomEscapeService;

    @GetMapping("/{name}")
    public RoomEscapeDto roomEscape(@PathVariable String name) {
        return roomEscapeService.roomEscape(name);
    }

    @Data
    static class RoomEscapeDto {
        private Long roomEscapeId;
        private String name;

    }

//    @PostMapping("/{name}")
//    public void createRoomEscape(@PathVariable String name) {
//        return roomEscapeService.
//    }
}
