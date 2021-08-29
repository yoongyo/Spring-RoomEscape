package bizchoollab.roomEscape.controller;


import bizchoollab.roomEscape.entity.Booking;
import bizchoollab.roomEscape.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;


    @GetMapping("/{roomEscape_name}/bookings")
    public List<Booking> bookings(@PathVariable String roomEscape_name) {
        return bookingService.bookings(roomEscape_name);
    }


}
