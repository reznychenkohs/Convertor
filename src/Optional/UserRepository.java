package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    List<User> users = new ArrayList<>();

    public List<User> getData() {

        users.add(new User(1, "Anna", "test1@example.com"));
        users.add(new User(2, "Paolo", "test2@example.com"));
        users.add(new User(3, "Jane", "test3@example.com"));
        users.add(new User(4, "Jack", "test4@example.com"));
        return users;
    }

    Optional<User> findUserById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    public Optional<User> findUserByEmail(String email) {
        return users.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst();
    }

    public void findAllUsers() {

        if (users.isEmpty()) {
            System.out.println("List is empty");
        } else {
            users.forEach(System.out::println);
        }
    }

    void isUserPresent(Optional<User> user) {
        if (user.isPresent()) {
            System.out.println("Значення присутнє: " + user.get());
        } else {
            System.out.println("Значення відсутнє");
        }
    }
}



