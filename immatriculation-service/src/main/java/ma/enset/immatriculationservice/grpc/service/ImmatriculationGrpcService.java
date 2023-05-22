package ma.enset.immatriculationservice.grpc.service;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;

import ma.enset.immatriculationservice.entities.Owner;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.grpc.stubs.Immatriculation;
import ma.enset.immatriculationservice.grpc.stubs.ImmatriculationServiceGrpc;
import ma.enset.immatriculationservice.mappers.GrpcMapper;
import ma.enset.immatriculationservice.repositories.OwnerRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@AllArgsConstructor
public class ImmatriculationGrpcService extends ImmatriculationServiceGrpc.ImmatriculationServiceImplBase {
    private OwnerRepository ownerRepository;
    private VehiculeRepository vehiculeRepository;
    private GrpcMapper grpcMapper;

    @Override
    public void getVehiculesList(Immatriculation.ListRequest request , StreamObserver<Immatriculation.getVehiculesListResponse> responseObserver){
        List<Vehicule> vehicules= this.vehiculeRepository.findAll();
        List<Immatriculation.Vehicule> vehiculeList=vehicules.stream().map(account->grpcMapper.fromVehiculeEntity(account)).collect(Collectors.toList());
        Immatriculation.getVehiculesListResponse vehiculesListResponse=Immatriculation.getVehiculesListResponse.newBuilder()
                .addAllVehicule(vehiculeList)
                .build();
        responseObserver.onNext(vehiculesListResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getOwnersList(Immatriculation.ListRequest request , StreamObserver<Immatriculation.getOwnersListResponse> responseObserver){
        List<Owner> owners= this.ownerRepository.findAll();
        List<Immatriculation.Owner> ownerList=owners.stream().map(owner->grpcMapper.fromOwnerEntity(owner)).collect(Collectors.toList());
        Immatriculation.getOwnersListResponse ownersistResponse=Immatriculation.getOwnersListResponse.newBuilder()
                .addAllOwner(ownerList)
                .build();
        responseObserver.onNext(ownersistResponse);
        responseObserver.onCompleted();
    }
}
