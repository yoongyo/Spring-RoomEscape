package bizchoollab.roomEscape.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
class ThemeTest {

    @Autowired
    private EntityManager em;

    @Test
    public void test() {
        RoomEscape roomEscape = new RoomEscape();
    }
}