package com.traveler.social;

import com.traveler.social.models.entities.User;

import javax.servlet.http.HttpServletRequest;

public final class UserSessionManager {

    public static User getSessionUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute("user");
    }

    public static Boolean setSessionUser(HttpServletRequest request, User user) {
        request.getSession().setAttribute("user", user);
        return true;
    }


    public static Boolean RemoveSessionuser(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return true;
    }
    public static Integer getSessionUserId(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        return Math.toIntExact(user.getId());
    }
}