package com.traveler.social.service;

import com.traveler.social.models.entities.PrivacyType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrivacyTypeService {
    PrivacyType save(PrivacyType privacyType);
    boolean update(PrivacyType privacyType);
    boolean delete(PrivacyType privacyType) throws Exception;
    List<PrivacyType> getAllPrivacyTypes();
}
