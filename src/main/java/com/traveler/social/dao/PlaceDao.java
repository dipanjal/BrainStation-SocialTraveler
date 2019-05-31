package com.traveler.social.dao;

import com.traveler.social.models.entities.Place;

import java.util.List;

public interface PlaceDao extends BaseDao{
    List<Place> getAllPlaces();
}
