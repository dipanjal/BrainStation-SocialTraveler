package com.traveler.social.dao;

import com.traveler.social.models.entities.Place;
import com.traveler.social.models.entities.PrivacyType;

import java.util.List;

public interface PrivacyTypeDao extends BaseDao{
    List<PrivacyType> getAllPrivacyTypes();
}
