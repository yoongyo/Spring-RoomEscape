package bizchoollab.roomEscape.repository;

import bizchoollab.roomEscape.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByRoomEscapeName(String roomEscape_name);
}
