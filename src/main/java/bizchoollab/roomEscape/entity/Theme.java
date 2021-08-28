package bizchoollab.roomEscape.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "themes")
@Getter
public class Theme {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String genre;

    private String descriptions;

    private int runningTime;

    private int difficulty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomEscape_id")
    private RoomEscape roomEscape;
}
