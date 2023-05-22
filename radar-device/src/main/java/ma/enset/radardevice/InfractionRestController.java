package ma.enset.radardevice;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
public class InfractionRestController {
    private RestTemplate restTemplate;
    @GetMapping("/radars")
    public List<Radar> getAllRadars(){
        String url="http://localhost:8082/radars";
        Radar[] radars=restTemplate.getForObject(url,Radar[].class);
        return Arrays.asList(radars);
    }
    @GetMapping("/matricules")
    public List<Long> getAllMatricules(){
        String url="http://localhost:8081/matricules";
        Long[] matricules=restTemplate.getForObject(url,Long[].class);
        return Arrays.asList(matricules);
    }
    @PostMapping("/infraction")
    public Infraction sentInfraction(@RequestBody Infraction infraction){
        // Set the request URL
        String url = "http://localhost:8082/radars/infraction"; // Replace with your endpoint URL
        // Create headers with Content-Type: application/json
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        // Create an HttpEntity object with headers and the request body object
        HttpEntity<Infraction> requestEntity = new HttpEntity<>(infraction, headers);
        // Send the POST request
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
        // Get the response body
        String responseBody = responseEntity.getBody();
        // Print the response
        System.out.println("Response: " + responseBody);
        return infraction;
    }
}
