package ma.enset.immatriculationservice.mappers;

import ma.enset.immatriculationservice.entities.Owner;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.grpc.stubs.Immatriculation;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class GrpcMapper {
    public Immatriculation.Vehicule fromVehiculeEntity(Vehicule vehicule){
        Immatriculation.Vehicule vehiculeGrpc=Immatriculation.Vehicule.newBuilder()
                .setMarque(vehicule.getMarque())
                .setMarque(vehicule.getModel())
                .setMatriculeNumber(vehicule.getMatricule_number())
                .setPower(vehicule.getPower())
                .setOwner(fromOwnerEntity(vehicule.getOwner()))
                .build();
        return vehiculeGrpc;
    }
    public Vehicule fromVehiculeGrpc(Immatriculation.Vehicule vehiculeGrpc) throws ParseException {
        Vehicule vehiculeEntity=Vehicule.builder()
                .model(vehiculeGrpc.getModel())
                .marque(vehiculeGrpc.getModel())
                .power((int)vehiculeGrpc.getPower())
                .matricule_number(vehiculeGrpc.getMatriculeNumber())
                .owner(fromOwnerGrpc(vehiculeGrpc.getOwner()))
                .build();
        return vehiculeEntity;
    }
    public Immatriculation.Owner fromOwnerEntity(Owner owner){
        Immatriculation.Owner ownerGrpc=Immatriculation.Owner.newBuilder()
                .setName(owner.getName())
                .setDateBirth(String.valueOf(owner.getDate_birth()))
                .setEmail(owner.getEmail())
                .build();
        return ownerGrpc;
    }
    public Owner fromOwnerGrpc(Immatriculation.Owner ownerGrpc) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Vehicule> vehiculesEntity=new ArrayList<>();
        for(Immatriculation.Vehicule vehicule:ownerGrpc.getVehiculesList()){
            vehiculesEntity.add(fromVehiculeGrpc(vehicule));
        }
        Owner ownerEntity=Owner.builder()
                .name(ownerGrpc.getName())
                .email(ownerGrpc.getEmail())
                .date_birth(dateFormat.parse(ownerGrpc.getDateBirth()))
                .vehicules(vehiculesEntity)
                .build();
        return ownerEntity;
    }
}
