package org.example.Boot_MVC.service;

import org.example.Boot_MVC.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);

}
