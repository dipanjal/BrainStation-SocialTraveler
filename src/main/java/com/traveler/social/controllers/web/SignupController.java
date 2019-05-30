package com.traveler.social.controllers.web;

import com.traveler.social.models.entities.User;
import com.traveler.social.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller

public class SignupController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/signup",method = RequestMethod.GET)
    public String SignupGet(Model model){
        model.addAttribute("user",new User());
        return "signup";
    }

    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public String SignupPost(@ModelAttribute("user") @Valid User user, BindingResult result){
        if(result.hasErrors()){
            return "signup";
        }
        User newUser = userService.save(user);
        if (newUser!=null){
            System.out.println("user created");
        }
        return "login";
    }
}
