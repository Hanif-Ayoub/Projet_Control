package ma.enset.radardevice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@SpringBootApplication
public class RadarDeviceApplication {
    Random random = new Random();

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RadarDeviceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(InfractionRestController infractionRestController) {
        return args -> {
            System.out.println(infractionRestController.getAllMatricules());
            List<Long> matricules=infractionRestController.getAllMatricules();
            List<Radar> radars=infractionRestController.getAllRadars();
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    int randomIndexRadar = random.nextInt(radars.size());
                    int randomIndexMatricule = random.nextInt(matricules.size());
                    int randomSpeed = random.nextInt(101) + 50;
                    Long montant = random.nextLong(1000);

                    Infraction infraction=Infraction.builder()
                            .date(new Date())
                            .radarNumber((radars.get(randomIndexRadar).getId()))
                            .maxSpeedRadar(radars.get(randomIndexRadar).getVitesseMax())
                            .vehiculeMatricule(matricules.get(randomIndexMatricule))
                            .vehiculeSpeed(randomSpeed)
                            .montant(montant)
                            .build();
                    infractionRestController.sentInfraction(infraction);
                    System.out.println(infraction);

                }
            };

            timer.schedule(task, 0, 1000);
        };
    }

}
