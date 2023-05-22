package ma.enset.radarservice;

import ma.enset.radarservice.entities.Radar;
import ma.enset.radarservice.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableFeignClients
public class RadarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(RadarRepository radarRepository, RepositoryRestConfiguration repositoryRestConfiguration) {
		repositoryRestConfiguration.exposeIdsFor(Radar.class);
		return args -> {
			radarRepository.save(new Radar(1,120,200,100,true));
			radarRepository.save(new Radar(2,160,100,400,false));
			radarRepository.save(new Radar(3,140,300,100,true));
			radarRepository.save(new Radar(4,130,500,400,true));
			radarRepository.save(new Radar(5,100,300,800,false));
		};
	}

}
