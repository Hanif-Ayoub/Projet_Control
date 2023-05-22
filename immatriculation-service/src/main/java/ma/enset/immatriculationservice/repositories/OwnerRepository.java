package ma.enset.immatriculationservice.repositories;

import ma.enset.immatriculationservice.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
