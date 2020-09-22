package spong;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
    public Account findByLogin(String login);
    public Account findByFirstName(String firstname);
    public List<Account> findByLastName(String lastname);
}
