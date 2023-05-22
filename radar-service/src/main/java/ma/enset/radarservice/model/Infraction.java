package ma.enset.radarservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class Infraction {
    private Long id;
    private Date date;
    private Long radarNumber;
    private Long vehiculeMatricule;
    private Long montant;
    private int vehiculeSpeed;
    private int maxSpeedRadar;
}
