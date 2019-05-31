package com.traveler.social.models.viewmodels;

import com.traveler.social.models.entities.Place;
import com.traveler.social.models.entities.PrivacyType;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Component
public class PostForm {
    private int id;
    private List<Place> places;
    private List<PrivacyType> privacyTypes;

    @NotNull
    private int userId;
    @NotNull(message = "must select a page")
    private int placeId;
    @NotNull(message = "must select a privacy type")
    private int privacyTypeId;
    @NotNull(message = "must write something")
    @Size(min = 5, max = 1500, message = "must write something")
    private String postContent;

    public PostForm() {
    }

    public PostForm(List<Place> places, List<PrivacyType> privacyTypes, int userId) {
        this.places = places;
        this.privacyTypes = privacyTypes;
        this.userId = userId;
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

    public List<PrivacyType> getPrivacyTypes() {
        return privacyTypes;
    }

    public void setPrivacyTypes(List<PrivacyType> privacyTypes) {
        this.privacyTypes = privacyTypes;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public int getPrivacyTypeId() {
        return privacyTypeId;
    }

    public void setPrivacyTypeId(int privacyTypeId) {
        this.privacyTypeId = privacyTypeId;
    }
}
