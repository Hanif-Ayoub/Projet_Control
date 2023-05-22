package ma.enset.radarservice.model;

import lombok.Data;

@Data
public class Vehicule {
    private Long id;
    private Long matricule_number;
    private String model;
    private String marque;
    private int power;
    private Owner owner;
}
