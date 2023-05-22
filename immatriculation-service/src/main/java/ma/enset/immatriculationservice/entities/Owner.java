package ma.enset.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date date_birth;
    private String email;
    @OneToMany(mappedBy = "owner")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Transient
    private List<Vehicule> vehicules;
}
