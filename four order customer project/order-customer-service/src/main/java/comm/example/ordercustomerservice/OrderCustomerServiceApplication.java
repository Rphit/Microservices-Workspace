package comm.example.ordercustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderCustomerServiceApplication.class, args);
	}

}
