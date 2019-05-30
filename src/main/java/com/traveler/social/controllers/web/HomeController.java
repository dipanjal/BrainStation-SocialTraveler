package com.traveler.social.controllers.web;

import com.traveler.social.models.entities.Post;

import com.traveler.social.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    PostService postService;
    @RequestMapping("/")
    public String allPosts(Model model){
        List<Post> posts = postService.getAllPublicPosts();
        model.addAttribute("posts",posts);
        return "home";
    }
}
