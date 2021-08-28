package bizchoollab.roomEscape.entity;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "roomEscapes")
@Getter
public class RoomEscape {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String representative;

    private String businessNumber;

    private String email;

    private String tel;

    private String address;

    private Time openHours;

    private Time closeHours;

    @OneToMany(mappedBy = "roomEscape", cascade = CascadeType.ALL)
    private List<Theme> themes;
}
