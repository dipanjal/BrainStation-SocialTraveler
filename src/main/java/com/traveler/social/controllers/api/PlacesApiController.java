package com.traveler.social.controllers.api;

import com.traveler.social.models.entities.Place;
import com.traveler.social.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/places")
public class PlacesApiController {

    @Autowired
    PlaceService placeService;

    @RequestMapping("/all")
    public Object getAllPlaces(){
        return placeService.getAllPlaces();
    }
}
