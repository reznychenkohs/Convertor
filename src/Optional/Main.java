package Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        userRepository.getData();

        Optional<User> user = userRepository.findUserById(1);
        userRepository.isUserPresent(user);

        Optional<User> user1 = userRepository.findUserByEmail("test2@example.com");
        userRepository.isUserPresent(user1);

        userRepository.findAllUsers();

    }
}
