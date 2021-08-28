package bizchoollab.roomEscape.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Booking {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String tel;

    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theme_id")
    private Theme theme;
}
