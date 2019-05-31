package com.traveler.social.service;

import com.traveler.social.models.entities.Post;
import com.traveler.social.models.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Post save(Post post);
    boolean update(Post post);
    boolean delete(Post post) throws Exception;
    Post getPostById(int id);
    List<Post> getAllPosts();
    List<Post> getAllPublicPosts();
}
