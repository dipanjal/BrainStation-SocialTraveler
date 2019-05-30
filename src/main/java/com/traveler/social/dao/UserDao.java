package com.traveler.social.dao;


import com.traveler.social.models.entities.User;

import java.util.List;

/**
 * REST OF THE BASIC FUNCTIONALITIES ARE INCLUDED IN BASE DAO
 * ADD USER RELATED ADDITIONAL METHOD PROTOTYPES HERE
 */

public interface UserDao extends BaseDao {
    List<User> getAllUsers();
    User getUserById(int id);
    User getUserByEmail(String userName);
    User varifyUserLogin(String userName, String password);
}
