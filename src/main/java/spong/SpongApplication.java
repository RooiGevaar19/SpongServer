package spong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.joda.time.LocalTime;

@SpringBootApplication
public class SpongApplication {

	public static void main(String[] args) {
		System.out.println("Spong Server App");
		LocalTime currentTime = new LocalTime();
    		System.out.println("The current local time is: " + currentTime);
		SpringApplication.run(SpongApplication.class, args);
	}

}
