package com.traveler.social.service;


import com.traveler.social.dao.UserDao;
import com.traveler.social.models.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return (User)userDao.save(user);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public boolean delete(User user) throws Exception {
        return userDao.delete(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByEmail(String userName) {
        return userDao.getUserByEmail(userName);
    }

    @Override
    public User varifyUserLogin(String userName, String password) {
        return userDao.varifyUserLogin(userName,password);
    }

}