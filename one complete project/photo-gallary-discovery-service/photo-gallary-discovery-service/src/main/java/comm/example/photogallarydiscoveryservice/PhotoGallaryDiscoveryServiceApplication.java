package comm.example.photogallarydiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoGallaryDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoGallaryDiscoveryServiceApplication.class, args);
	}

}
