package com.traveler.social.dao;

import com.traveler.social.models.entities.Post;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PostDao extends BaseDao {
    List<Post> getAllPosts();
    List<Post> getAllPublicPosts();
    Post getPosyById(int id);
}
