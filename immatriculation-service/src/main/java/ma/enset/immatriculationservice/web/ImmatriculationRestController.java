package ma.enset.immatriculationservice.web;

import ma.enset.immatriculationservice.entities.Owner;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.grpc.stubs.Immatriculation;
import ma.enset.immatriculationservice.repositories.OwnerRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class ImmatriculationRestController {
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private VehiculeRepository vehiculeRepository;

/*    public ImmatriculationRestController(OwnerRepository ownerRepository,VehiculeRepository vehiculeRepository) {
        this.ownerRepository=ownerRepository;
        this.vehiculeRepository=vehiculeRepository;
    }*/

    @GetMapping("/vehicules")
    public List<Vehicule> getAllVehicules(){
        return this.vehiculeRepository.findAll();
    }
    @GetMapping("/matricules")
    public List<Long> getAllMatricules(){
        List<Vehicule> vehicules=this.vehiculeRepository.findAll();
        List<Long> matriculeList=vehicules.stream().map(vehicule->vehicule.getMatricule_number()).collect(Collectors.toList());
        return matriculeList;
    }
    @GetMapping("/vehicules/{id}")
    public Optional<Vehicule> getVehicule(@PathVariable Long id){
        return this.vehiculeRepository.findById(id);
    }
    @PostMapping("/vehicule")
    public Vehicule save(@RequestBody Vehicule vehicule){
        this.ownerRepository.save(vehicule.getOwner());
        return this.vehiculeRepository.save(vehicule);
    }
    @PutMapping("/vehicule/{id}")
    public Vehicule updateVehicule(@PathVariable Long id,@RequestBody Vehicule vehicule){
        Optional<Vehicule> vehiculeToUpdate=this.vehiculeRepository.findById(id);
        if(vehicule.getMarque()!=null) vehiculeToUpdate.get().setMarque (vehicule.getMarque());
        if(vehicule.getModel()!=null) vehiculeToUpdate.get().setModel (vehicule.getModel());
        if(vehicule.getPower()!=0) vehiculeToUpdate.get().setPower (vehicule.getPower());
        if(vehicule.getMatricule_number()!=null) vehiculeToUpdate.get().setMatricule_number (vehicule.getMatricule_number());
        if(vehicule.getOwner()!=null) vehiculeToUpdate.get().setOwner (vehicule.getOwner());
        return this.vehiculeRepository.save(vehiculeToUpdate.get());
    }
    @DeleteMapping("/vehicule/{id}")
    public void deleteVehicule(@PathVariable Long id){
        this.vehiculeRepository.deleteById(id);
    }


    @GetMapping("/owners")
    public List<Owner> getAllOwners(){
        return this.ownerRepository.findAll();
    }
    @GetMapping("/owners/{id}")
    public Optional<Owner> getOwner(@PathVariable Long id){
        return this.ownerRepository.findById(id);
    }
    @PostMapping("/owner")
    public Owner save(@RequestBody Owner owner){
        return this.ownerRepository.save(owner);
    }
    @PutMapping("/owner/{id}")
    public Owner updateOwner(@PathVariable Long id,@RequestBody Owner owner){
        Optional<Owner> ownerToUpdate=this.ownerRepository.findById(id);
        if(owner.getName()!=null) ownerToUpdate.get().setName (owner.getName());
        if(owner.getEmail()!=null) ownerToUpdate.get().setEmail (owner.getEmail());
        if(owner.getDate_birth()!=null) ownerToUpdate.get().setDate_birth (owner.getDate_birth());
        if(owner.getVehicules()!=null) ownerToUpdate.get().setDate_birth (owner.getDate_birth());
        return this.ownerRepository.save(owner);
    }
    @DeleteMapping("/owner/{id}")
    public void deleteOwner(@PathVariable Long id){
        this.ownerRepository.deleteById(id);
    }
}
