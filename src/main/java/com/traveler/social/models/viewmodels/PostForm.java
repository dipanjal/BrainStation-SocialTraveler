package com.traveler.social.models.viewmodels;

import com.traveler.social.models.entities.Place;
import com.traveler.social.models.entities.PrivaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostForm {
    private int id;
    private List<Place> places;
    private List<PrivaryType> privaryTypes;
    private int user_id;
    private String postContent;

    @Autowired



    public PostForm() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public List<PrivaryType> getPrivaryTypes() {
        return privaryTypes;
    }

    public void setPrivaryTypes(List<PrivaryType> privaryTypes) {
        this.privaryTypes = privaryTypes;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
