package ma.enset.radarservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class Owner {
    private Long id;
    private String name;
    private String email;
    private Date date_birth;
}
