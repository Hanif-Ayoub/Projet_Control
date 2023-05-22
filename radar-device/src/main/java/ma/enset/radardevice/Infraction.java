package ma.enset.radardevice;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data @Builder @ToString
public class Infraction {
    private Long id;
    private Date date;
    private Long radarNumber;
    private Long vehiculeMatricule;
    private Long montant;
    private int vehiculeSpeed;
    private int maxSpeedRadar;
}
