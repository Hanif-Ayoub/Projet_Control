package ma.enset.radarservice.web;

import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.feign.ImmatriculationRestClient;
import ma.enset.radarservice.feign.InfractionRestClient;
import ma.enset.radarservice.model.Infraction;
import ma.enset.radarservice.model.Vehicule;
import ma.enset.radarservice.repositories.RadarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RadarRestController {

    private RadarRepository radarRepository;
    private ImmatriculationRestClient immatriculationRestClient;
    private InfractionRestClient infractionRestClient;

    public RadarRestController(RadarRepository radarRepository,
                               ImmatriculationRestClient immatriculationRestClient,
                               InfractionRestClient infractionRestClient) {
        this.radarRepository = radarRepository;
        this.immatriculationRestClient = immatriculationRestClient;
        this.infractionRestClient = infractionRestClient;
    }



    @GetMapping("/radars")
    public List<Radar> getRadars(){
        return radarRepository.findAll();
    }
/*    @GetMapping("/radarsInfos")
    public List<Object> getRadarsInfos(){
         List<Radar> radars=radarRepository.findAll();
         List<Object> radarInfosleList=radars.stream().map(radar->{radar.getId(),radar.getVitesseMax()}).collect(Collectors.toList());
         return radarInfosleList;
    }*/
    @GetMapping("/radars/{id}")
    public Radar getRadar(@PathVariable Long id){
        return this.radarRepository.findById(id).orElseThrow();
    }
    @PostMapping("/radars")
    public Radar save(@RequestBody Radar radar){
        return this.radarRepository.save(radar);
    }
    @PutMapping("/radars/{id}")
    public Radar update(@PathVariable Long id,@RequestBody Radar radar){
        Radar radarToUpdate=this.radarRepository.findById(id).orElseThrow();
        if(radar.getVitesseMax()==0) radarToUpdate.setVitesseMax(radar.getVitesseMax());
        if(radar.getLatitude()==0) radarToUpdate.setLatitude(radar.getLatitude());
        if(radar.getLongitude()==0) radarToUpdate.setLongitude(radar.getLongitude());
        return this.radarRepository.save(radarToUpdate);
    }
    @DeleteMapping("/radars/{id}")
    public boolean delete(@PathVariable Long id){
        this.radarRepository.deleteById(id);
        return true;
    }

    @GetMapping("/radars/vehicule/{id}")
    public Vehicule getVehicule(@PathVariable Long id){
        return this.immatriculationRestClient.getVehiculeById(id);
    }
    @PostMapping("/radars/infraction")
    public Infraction saveInfraction(@RequestBody Infraction infraction){
        if(infraction.getMaxSpeedRadar()>infraction.getVehiculeSpeed()) return infraction;
        return this.infractionRestClient.save(infraction);
    }
}
