package comm.example.orderdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OrderDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderDiscoveryServiceApplication.class, args);
	}

}
