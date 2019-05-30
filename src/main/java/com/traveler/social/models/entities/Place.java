package com.traveler.social.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Place {
    private int id;
    private String placeName;
    private Double latitude;
    private Double longitude;

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
    @Column(name = "place_name")
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    @Basic
    @Column(name = "latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place places = (Place) o;
        return id == places.id &&
                Objects.equals(placeName, places.placeName) &&
                Objects.equals(latitude, places.latitude) &&
                Objects.equals(longitude, places.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placeName, latitude, longitude);
    }
}
