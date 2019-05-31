package com.traveler.social.dao;

import com.traveler.social.models.entities.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostDaoImp extends BaseDaoImp implements PostDao{
    @Override
    public List<Post> getAllPosts() {
        List<Post> posts = super.getCurrentHibernateSession()
                .createQuery("from Post").list();
        return posts;
    }

    @Override
    public List<Post> getAllPublicPosts() {
        List<Post> posts = super.getCurrentHibernateSession()
                .createQuery("FROM Post WHERE privacyTypeId=:privacyTypeId")
                .setParameter("privacyTypeId",1)
                .setMaxResults(50)
                .list();
        return posts;
    }

    @Override
    public Post getPosyById(int id) {
        return (Post) super.getCurrentHibernateSession()
                .createQuery("from Post WHERE id=:id")
                .setParameter("id",id)
                .setMaxResults(1)
                .uniqueResult();
    }
}
