package com.traveler.social.controllers.web;

import com.traveler.social.models.entities.User;
import com.traveler.social.models.viewmodels.LoginForm;
import com.traveler.social.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("loginForm",new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String loginPost(@ModelAttribute("loginForm") @Valid LoginForm loginForm, BindingResult result, Model model){
        if(result.hasErrors()){
            return "login";
        }
        User user = userService.varifyUserLogin(loginForm.getEmail(),loginForm.getPassword());
        if(user==null){
            model.addAttribute("message","wrong credentials");
        }else{
            return "redirect:/home";
        }


        return "login";
    }
}
