package ma.enset.immatriculationservice.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long matricule_number;
    private String model;
    private String marque;
    private int power;
    @ManyToOne
    private Owner owner;
}
