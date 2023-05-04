package sopt.org.ThirdSeminar.domain;

import lombok.*;
import org.hibernate.boot.model.source.spi.FetchCharacteristics;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alarm {
    public Alarm(User user, String name) {
        this.user = user;
        this.name = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    @Column
    private String name;
}
