package com.traveler.social.service;

import com.traveler.social.dao.PostDao;
import com.traveler.social.models.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImp implements PostService {

    @Autowired
    PostDao postDao;

    @Override
    public List<Post> getAllPosts() {
        return postDao.getAllPosts();
    }

    @Override
    public List<Post> getAllPublicPosts() {
        return postDao.getAllPublicPosts();
    }
}
