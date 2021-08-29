package bizchoollab.roomEscape.service;

import bizchoollab.roomEscape.entity.Booking;
import bizchoollab.roomEscape.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    public List<Booking> bookings(String roomEscape_name) {
        return bookingRepository.findBookingsByRoomEscapeName(roomEscape_name);
    }

}
