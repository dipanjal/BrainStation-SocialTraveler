package com.traveler.social.dao;


import com.traveler.social.models.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp extends BaseDaoImp implements UserDao {

    public List<User> getAllUsers() {
        List<User> userList = super.getCurrentHibernateSession().createQuery("from User").list();
        return userList;
    }

    public User getUserById(int id){
        return getCurrentHibernateSession().get(User.class,id);
    }
    public User getUserByEmail(String userName){
        return (User)getCurrentHibernateSession().createQuery("from User WHERE userName =: user_name")
                .setParameter("user_name",userName)
                .uniqueResult();
    }

    public User varifyUserLogin(String userName,String password){
        User user = (User)getCurrentHibernateSession().createQuery("FROM User " +
                "WHERE email =:email and password=:pass")
                .setParameter("email",userName)
                .setParameter("pass",password)
                .setMaxResults(1)
                .uniqueResult();
        return user;
    }
}