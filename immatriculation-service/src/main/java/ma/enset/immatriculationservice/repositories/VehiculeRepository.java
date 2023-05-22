package ma.enset.immatriculationservice.repositories;

import ma.enset.immatriculationservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
}
