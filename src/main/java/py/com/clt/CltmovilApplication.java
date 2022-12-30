package py.com.clt;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CltmovilApplication {

	public static void main(String[] args) {
		SpringApplication.run(CltmovilApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
	 return new ModelMapper();
	}

}
