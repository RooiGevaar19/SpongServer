package spong;

import org.springframework.data.annotation.Id;


public class Account {
    @Id
    public String id;

    public String login;
    public String firstName;
    public String lastName;

    public Account() {}

    public Account(String login) {
        this.login = login;
    }

    public Account(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s", login, firstName, lastName);
    }

}