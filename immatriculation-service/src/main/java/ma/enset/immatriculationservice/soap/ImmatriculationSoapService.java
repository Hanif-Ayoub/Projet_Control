package ma.enset.immatriculationservice.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.entities.Owner;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.repositories.OwnerRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService
@AllArgsConstructor
public class ImmatriculationSoapService {
    private OwnerRepository ownerRepository;
    private VehiculeRepository vehiculeRepository;

    @WebMethod
    public List<Vehicule> vehiculesList(){
        return vehiculeRepository.findAll();
    }

    @WebMethod
    public Vehicule vehiculeById(@WebParam(name = "id") Long id){
        Vehicule vehicule = vehiculeRepository.findById(id).get();
        return vehicule;
    }

    @WebMethod
    public List<Owner> ownersList(){
        return ownerRepository.findAll();
    }

    @WebMethod
    public Owner ownerById(@WebParam(name = "id") Long id){
        Owner owner = ownerRepository.findById(id).get();
        return owner;
    }
}
