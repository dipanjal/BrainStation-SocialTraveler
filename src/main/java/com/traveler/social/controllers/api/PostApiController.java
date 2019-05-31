package com.traveler.social.controllers.api;

import com.traveler.social.service.PlaceService;
import com.traveler.social.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PostApiController {

    @Autowired
    PostService postService;

    @RequestMapping("/all")
    public Object getAllPosts(){
        return postService.getAllPosts();
    }


    @RequestMapping("/all/public")
    public Object getAllPublicPosts(){
        return postService.getAllPublicPosts();
    }
}
