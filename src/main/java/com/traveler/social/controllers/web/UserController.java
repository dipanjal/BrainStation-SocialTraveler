package com.traveler.social.controllers.web;

import com.traveler.social.models.entities.Post;
import com.traveler.social.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    PostService postService;
    @RequestMapping("/timeline")
    public String allPosts(Model model){
//        List<Post> posts = postService.getAllPosts();
//        model.addAttribute("posts",posts);
        return "timeline";
    }
}
