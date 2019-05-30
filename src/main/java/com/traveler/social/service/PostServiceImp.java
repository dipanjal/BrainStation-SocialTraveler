package com.traveler.social.service;

import com.traveler.social.dao.PostDao;
import com.traveler.social.models.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PostServiceImp implements PostService {

    @Autowired
    PostDao postDao;

    @Override
    public Post save(Post post) {
        return (Post)postDao.save(post);
    }

    @Override
    public boolean update(Post post) {
        return postDao.update(post);
    }

    @Override
    public boolean delete(Post post) throws Exception {
        return postDao.delete(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postDao.getAllPosts();
    }

    @Override
    public List<Post> getAllPublicPosts() {
        return postDao.getAllPublicPosts();
    }
}
