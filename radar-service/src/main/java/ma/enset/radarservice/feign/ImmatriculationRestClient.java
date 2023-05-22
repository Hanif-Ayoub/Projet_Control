package ma.enset.radarservice.feign;

import ma.enset.radarservice.model.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface ImmatriculationRestClient {
    @GetMapping(path = "/vehicules/{id}")
    Vehicule getVehiculeById(@PathVariable(name = "id") Long id);
}
