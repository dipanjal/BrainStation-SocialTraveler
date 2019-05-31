package com.traveler.social.models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "Posts", schema = "social_traveler")
public class Post {
    private int id;
    @NotNull
    private int userId;
    @NotNull(message = "must select a privacy")
    private int privacyTypeId;
    @NotNull(message = "must select a place")
    private int placeId;
    @NotNull(message = "must write something")
    @Size(min = 5, max = 1500, message = "must write something")
    private String postContent;

    private User user;
    private Place place;
    private PrivacyType privacyType;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "privacy_type_id")
    public int getPrivacyTypeId() {
        return privacyTypeId;
    }

    public void setPrivacyTypeId(int privacyTypeId) {
        this.privacyTypeId = privacyTypeId;
    }

    @Basic
    @Column(name = "place_id")
    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    @Basic
    @Column(name = "post_content")
    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne
    @JoinColumn(name = "place_id", referencedColumnName = "id", insertable = false, updatable = false)
    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @OneToOne
    @JoinColumn(name = "privacy_type_id", referencedColumnName = "id", insertable = false, updatable = false)
    public PrivacyType getPrivacyType() {
        return privacyType;
    }

    public void setPrivacyType(PrivacyType privacyType) {
        this.privacyType = privacyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post posts = (Post) o;
        return id == posts.id &&
                userId == posts.userId &&
                privacyTypeId == posts.privacyTypeId &&
                placeId == posts.placeId &&
                Objects.equals(postContent, posts.postContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, privacyTypeId, placeId, postContent);
    }
}
