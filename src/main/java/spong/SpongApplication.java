package spong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpongApplication {

	public static void main(String[] args) {
		System.out.println("Spong Server App");
		SpringApplication.run(SpongApplication.class, args);
	}

}
