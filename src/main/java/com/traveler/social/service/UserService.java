package com.traveler.social.service;



import com.traveler.social.models.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User save(User user);
    boolean update(User user);
    boolean delete(User user) throws Exception;
    List<User> getAllUsers();
    User getUserById(int id);
    User getUserByEmail(String userName);
    User varifyUserLogin(String userName, String password);
}
