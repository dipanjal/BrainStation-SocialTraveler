package com.traveler.social.service;

import com.traveler.social.models.entities.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List<Post> getAllPosts();
    List<Post> getAllPublicPosts();
}
