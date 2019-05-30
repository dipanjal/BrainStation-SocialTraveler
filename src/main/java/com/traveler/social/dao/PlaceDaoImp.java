package com.traveler.social.dao;

import com.traveler.social.models.entities.Place;
import com.traveler.social.models.entities.Post;

import java.util.List;

public class PlaceDaoImp extends BaseDaoImp {
    public List<Place> getAllPlaces() {
        List<Place> places = super.getCurrentHibernateSession()
                .createQuery("from Place").list();
        return places;
    }
}
