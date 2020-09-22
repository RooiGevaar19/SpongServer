package spong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.joda.time.LocalTime;

@SpringBootApplication
public class SpongApplication implements CommandLineRunner {
    @Autowired
    private AccountRepository repository;

	public static void main(String[] args) {

		System.out.println("Spong Server App");
		LocalTime currentTime = new LocalTime();
            System.out.println("The current local time is: " + currentTime);
            
        
        SpringApplication.run(SpongApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();
        // save a couple of customers
        repository.save(new Account("analdestroyer69", "Alice", "Smith"));
        repository.save(new Account("bobas1488213769", "Bob", "Smith"));

        // fetch all customers
        System.out.println("Account found with findAll():");
        System.out.println("-------------------------------");
        for (Account item : repository.findAll()) {
            System.out.println(item);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Account found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));
        System.out.println("Account found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Account item : repository.findByLastName("Smith")) {
            System.out.println(item);
        }

  }
}
