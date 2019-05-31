package com.traveler.social.controllers.api;

import com.traveler.social.service.PlaceService;
import com.traveler.social.service.PrivacyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/privacy")
public class PrivacyApiController {

    @Autowired
    PrivacyTypeService privacyTypeService;

    @RequestMapping("/all")
    public Object getAllPrivacy(){
        return privacyTypeService.getAllPrivacyTypes();
    }
}
