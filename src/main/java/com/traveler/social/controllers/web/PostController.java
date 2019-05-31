package com.traveler.social.controllers.web;

import com.traveler.social.models.entities.Post;
import com.traveler.social.service.PlaceService;
import com.traveler.social.service.PostService;
import com.traveler.social.service.PrivacyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;
    @Autowired
    PlaceService placeService;
    @Autowired
    PrivacyTypeService privacyTypeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){
        Post post = new Post();
        post.setUserId(1);
        model.addAttribute("newPost", post);
        return "post";
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String SignupPost(
            @ModelAttribute("newPost") @Valid Post postToSave,
            BindingResult result,
            Model model){
        if(result.hasErrors()){
//            return "redirect:" + "/post";
            return "post";
        }

        Post newPost = new Post();
        newPost.setUserId(1);
        model.addAttribute("newPost",newPost);
        model.addAttribute("btnText", "Post");

        if(postService.save(postToSave)!=null){
            model.addAttribute("message","post created");
        }else{
            model.addAttribute("message","something went wrong");
        }
        return "post";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editIndex(@PathVariable(name="id") int id, Model model){
        Post post = postService.getPostById(id);
        post.setUserId(1);
        model.addAttribute("newPost", post);
        model.addAttribute("btnText", "update");
        return "post-edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editConfirm(@ModelAttribute("newPost") @Valid Post postToUpdate,
                        BindingResult result,
                        Model model){
        if(result.hasErrors()){
            return "post-edit";
        }
        if(postService.update(postToUpdate)){
            return "redirect:/user/timeline";
        }
        model.addAttribute("message","somwthing went wrong");
        return "post-edit";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deletePost(@PathVariable(name="id") int id, Model model){
        Post postToDelete = postService.getPostById(id);
        try{
            if(postToDelete!=null){
                if(postService.delete(postToDelete)){
                    model.addAttribute("message", "post deleted");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("message", "something went wrong");
        }
        return "timeline";
    }
}
