package ma.enset.immatriculationservice.web;

import ma.enset.immatriculationservice.entities.Owner;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.repositories.OwnerRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ImmatriculationGraphqlController {
    private VehiculeRepository vehiculeRepository;
    private OwnerRepository ownerRepository;

    public ImmatriculationGraphqlController(VehiculeRepository vehiculeRepository, OwnerRepository ownerRepository) {
        this.vehiculeRepository = vehiculeRepository;
        this.ownerRepository = ownerRepository;
    }

    @QueryMapping
    public List<Vehicule> vehiculesList(){
        return this.vehiculeRepository.findAll();
    }
    @QueryMapping
    public Vehicule vehiculeById(@Argument Long id){
        return this.vehiculeRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("vehicule not found")));
    }
    @QueryMapping
    public List<Owner> ownersList(){
        return this.ownerRepository.findAll();
    }
    @QueryMapping
    public Owner ownerById(@Argument Long id){
        return this.ownerRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("owner not found")));
    }
    @MutationMapping
    public Vehicule addVehicule(@Argument Vehicule vehicule){
        return this.vehiculeRepository.save(vehicule);
    }
    @MutationMapping
    public Vehicule updateVehicule(@Argument Long id,@Argument Vehicule vehicule){
        Vehicule vehiculeToUpdate=this.vehiculeRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("vehicule not found")));
        if(vehicule.getMarque()!=null) vehiculeToUpdate.setMarque (vehicule.getMarque());
        if(vehicule.getModel()!=null) vehiculeToUpdate.setModel (vehicule.getModel());
        if(vehicule.getPower()!=0) vehiculeToUpdate.setPower (vehicule.getPower());
        if(vehicule.getMatricule_number()!=null) vehiculeToUpdate.setMatricule_number (vehicule.getMatricule_number());
        if(vehicule.getOwner()!=null) vehiculeToUpdate.setOwner (vehicule.getOwner());
        return this.vehiculeRepository.save(vehiculeToUpdate);
    }
    @MutationMapping
    public boolean deleteVehicule(@Argument Long id){
         this.vehiculeRepository.deleteById(id);
         return true;
    }
    @MutationMapping
    public Owner addOwner(@Argument Owner owner){
        return this.ownerRepository.save(owner);
    }
    @MutationMapping
    public Owner updateOwner(@Argument Long id,@Argument Owner owner){
        Owner ownerToUpdate=this.ownerRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("owner not found")));
        if(owner.getName()!=null) ownerToUpdate.setName (owner.getName());
        if(owner.getEmail()!=null) ownerToUpdate.setEmail (owner.getEmail());
        if(owner.getDate_birth()!=null) ownerToUpdate.setDate_birth (owner.getDate_birth());
        if(owner.getVehicules()!=null) ownerToUpdate.setDate_birth (owner.getDate_birth());
        return this.ownerRepository.save(ownerToUpdate);
    }
    @MutationMapping
    public boolean deleteOwner(@Argument Long id){
        this.ownerRepository.deleteById(id);
        return true;
    }
}
