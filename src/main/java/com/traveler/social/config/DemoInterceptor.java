package com.traveler.social.config;

import com.traveler.social.UserSessionManager;
import com.traveler.social.models.entities.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URL;

public class DemoInterceptor implements HandlerInterceptor {

    String[] excludeMappingUrls = new String[]{"","/","/login"};

    @Override
    public boolean preHandle(HttpServletRequest request,  HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Inside pre handle");
        String path = new URL(request.getRequestURL().toString()).getPath();
        System.out.println(path);
        for(String url:excludeMappingUrls){
            if(url.contains(path)){
                return true;
            }
        }
        User user = UserSessionManager.getSessionUser(request);
        if(user==null){
            response.sendRedirect("/");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("Inside post handle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception exception)
            throws Exception {
        System.out.println("Inside after completion");
    }
}