package comm.example.myphotoappuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class MyphotoappUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyphotoappUserServiceApplication.class, args);
	}

//creating bean fro password 
   @Bean
  public BCryptPasswordEncoder getbCryptPasswordEncoder()
  {
	  return new BCryptPasswordEncoder();
  }


}
