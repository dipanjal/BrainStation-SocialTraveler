package com.traveler.social.controllers.web;

import com.traveler.social.UserSessionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/logout")
public class LogoutController {

    @RequestMapping("")
    public String logout(HttpServletRequest request){
        if(UserSessionManager.RemoveSessionuser(request)){
            return "redirect:/";
        }
        return "home";
    }
}
