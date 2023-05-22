package ma.enset.radarservice.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.radarservice.grpc.stubs.Radar;
import ma.enset.radarservice.grpc.stubs.radarDeviceGrpc;

public class RadarGrpcClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 2222)
                .usePlaintext()
                .build();
        radarDeviceGrpc.radarDeviceBlockingStub blockingStub = radarDeviceGrpc.newBlockingStub(channel);

        Radar.radarInformations request = Radar.radarInformations.newBuilder()
                .setRadarId(1)
                .setRadarMax(1)
                .build();

        Radar.infraction infraction = blockingStub.getConnected(request).next();
        System.out.println("-------------------------");
        System.out.println(infraction);
        System.out.println("-------------------------");

        channel.shutdown();
    }
}
