package com.traveler.social.controllers.web;

import com.traveler.social.UserSessionManager;
import com.traveler.social.models.entities.User;
import com.traveler.social.models.viewmodels.LoginForm;
import com.traveler.social.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping("/")
    public String index(Model model,HttpServletRequest request){
        User loggedUser = UserSessionManager.getSessionUser(request);
        if(loggedUser!=null){
            logger.debug("showing login page");
            return "home";
        }
        model.addAttribute("loginForm",new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String loginPost(@ModelAttribute("loginForm") @Valid LoginForm loginForm, BindingResult result, Model model,
                            HttpServletRequest request){
        if(result.hasErrors()){
            logger.debug("problem with model validation");
            return "login";
        }
        User user = userService.varifyUserLogin(loginForm.getEmail(),loginForm.getPassword());
        if(user==null){
            logger.debug("incorrect login credentials");
            model.addAttribute("message","wrong credentials");
        }else{
            if (UserSessionManager.setSessionUser(request,user)){
                logger.debug("User Logged in");
                return "redirect:/home";
            }
        }
        return "login";
    }
}
