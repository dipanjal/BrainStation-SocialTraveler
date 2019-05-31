package com.traveler.social.dao;

import com.traveler.social.models.entities.Place;
import com.traveler.social.models.entities.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlaceDaoImp extends BaseDaoImp implements PlaceDao {

    @Override
    public List<Place> getAllPlaces() {
        List<Place> places = super.getCurrentHibernateSession()
                .createQuery("from Place").list();
        return places;
    }
}
