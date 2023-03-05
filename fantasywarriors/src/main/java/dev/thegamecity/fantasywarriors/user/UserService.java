package dev.thegamecity.fantasywarriors.user;

import dev.thegamecity.fantasywarriors.PasswordEncoder;
import dev.thegamecity.fantasywarriors.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        PasswordEncoder passwordEncoder = new PasswordEncoder();
        List<User> usersInDB = userRepository.findAll();
        for (int i = 0; i < usersInDB.size(); i++) {
            usersInDB.get(i).setPassword(passwordEncoder.encode(usersInDB.get(i).getPassword()));
        }
        return usersInDB;
    }

    public User createUser(User user) {
        User newUser = userRepository.insert(user);
        PasswordEncoder passwordEncoder = new PasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        System.out.println("Default: " + user.getPassword() + "| Encoded: " + encodedPassword);
        user.setPassword(encodedPassword);
        return newUser;
    }
}
