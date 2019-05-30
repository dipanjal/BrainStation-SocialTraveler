package com.traveler.social.controllers.web;

import com.traveler.social.models.entities.Post;
import com.traveler.social.models.entities.User;
import com.traveler.social.models.viewmodels.PostForm;
import com.traveler.social.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("newPost", new PostForm());
        return "post";
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String SignupPost(@ModelAttribute("newPost") @Valid PostForm newPostForm, BindingResult result){
        if(result.hasErrors()){
            return "post";
        }
//        Post post = postService.save(newPost);
//        if (post!=null){
//            System.out.println("post created");
//        }
        return "login";
    }
}
