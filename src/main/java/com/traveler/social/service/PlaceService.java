package com.traveler.social.service;

import com.traveler.social.models.entities.Place;
import com.traveler.social.models.entities.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlaceService {
    Post save(Post post);
    boolean update(Post post);
    boolean delete(Post post) throws Exception;
    List<Place> getAllPlaces();
}
