package ma.enset.radarservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Radar {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int vitesseMax;
    private int longitude;
    private int latitude;
    private boolean state;
}
