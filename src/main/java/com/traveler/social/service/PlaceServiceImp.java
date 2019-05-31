package com.traveler.social.service;

import com.traveler.social.dao.PlaceDao;
import com.traveler.social.models.entities.Place;
import com.traveler.social.models.entities.Post;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlaceServiceImp implements PlaceService {
    @Autowired
    PlaceDao placeDao;

    @Override
    public Post save(Post post) {
        return (Post) placeDao.save(post);
    }

    @Override
    public boolean update(Post post) {
        return placeDao.update(post);
    }

    @Override
    public boolean delete(Post post) throws Exception {
        return placeDao.delete(post);
    }

    @Override
    public List<Place> getAllPlaces() {
        return placeDao.getAllPlaces();
    }
}
