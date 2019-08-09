package comm.example.myphotogalleryaccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyphotogalleryAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyphotogalleryAccountServiceApplication.class, args);
	}

}
