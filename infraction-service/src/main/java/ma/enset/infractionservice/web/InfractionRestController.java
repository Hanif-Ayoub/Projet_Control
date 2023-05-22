package ma.enset.infractionservice.web;

import ma.enset.infractionservice.entities.Infraction;
import ma.enset.infractionservice.repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RestResource
public class InfractionRestController {
    private InfractionRepository infractionRepository;

    public InfractionRestController(InfractionRepository infractionRepository) {
        this.infractionRepository = infractionRepository;
    }

    @GetMapping("/infractions")
    public List<Infraction> getInfractions(){
        return infractionRepository.findAll();
    }
    @GetMapping("/infractions/{id}")
    public Infraction getInfraction(@PathVariable Long id){
        return this.infractionRepository.findById(id).orElseThrow();
    }
    @PostMapping("/infractions")
    public Infraction save(@RequestBody Infraction infraction){
        return this.infractionRepository.save(infraction);
    }
    @PutMapping("/infractions/{id}")
    public Infraction update(@PathVariable Long id,@RequestBody Infraction infraction){
        Infraction infractionToUpdate=this.infractionRepository.findById(id).orElseThrow();
        if(infraction.getDate()!=null) infractionToUpdate.setDate(infraction.getDate());
        if(infraction.getRadarNumber()!=null) infractionToUpdate.setRadarNumber(infraction.getRadarNumber());
        if(infraction.getVehiculeMatricule()!=null) infractionToUpdate.setVehiculeMatricule(infraction.getVehiculeMatricule());
        if(infraction.getVehiculeSpeed()!=0) infractionToUpdate.setVehiculeSpeed(infraction.getVehiculeSpeed());
        if(infraction.getMaxSpeedRadar()!=0) infractionToUpdate.setMaxSpeedRadar(infraction.getMaxSpeedRadar());
        if(infraction.getMontant()!=0) infractionToUpdate.setMontant(infraction.getMontant());
        return this.infractionRepository.save(infractionToUpdate);
    }
    @DeleteMapping("/infractions/{id}")
    public boolean delete(@PathVariable Long id){
        this.infractionRepository.deleteById(id);
        return true;
    }

}
