package ma.enset.immatriculationservice;

import ma.enset.immatriculationservice.entities.Owner;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.repositories.OwnerRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class ImmatriculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmatriculationServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(VehiculeRepository vehiculeRepository, OwnerRepository ownerRepository) {
		return args -> {

			Stream.of("ali","anas","amine").forEach(c->{
				Owner owner= Owner.builder()
						.name(c)
						.date_birth(new Date())
						.email("email@email")
						.build();
				ownerRepository.save(owner);
				Random random = new Random();
				Long randomNumber = random.nextLong(90000) + 10000;
				Vehicule vehicule=Vehicule.builder()
						.matricule_number(randomNumber)
						.model("model ABC")
						.marque("marque ABC")
						.power(999)
						.owner(owner)
						.build();
				vehiculeRepository.save(vehicule);
				//ownerRepository.findAll().forEach(cs->{});
			});
		};
	}
}
