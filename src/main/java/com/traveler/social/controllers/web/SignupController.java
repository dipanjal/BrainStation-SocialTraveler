package com.traveler.social.controllers.web;

import com.traveler.social.models.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller

public class SignupController {

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
        return "login";
    }
}
