package com.traveler.social.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PrivaryTypes", schema = "social_traveler")
public class PrivaryType {
    private int id;
    private String privacyType;
    private String description;

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
    @Column(name = "privacy_type")
    public String getPrivacyType() {
        return privacyType;
    }

    public void setPrivacyType(String privacyType) {
        this.privacyType = privacyType;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrivaryType that = (PrivaryType) o;
        return id == that.id &&
                Objects.equals(privacyType, that.privacyType) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, privacyType, description);
    }
}
