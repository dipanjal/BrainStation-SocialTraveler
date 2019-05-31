package com.traveler.social.service;


import com.traveler.social.dao.PrivacyTypeDao;
import com.traveler.social.models.entities.PrivacyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PrivacyTypeServiceImp implements PrivacyTypeService{

    @Autowired
    PrivacyTypeDao privacyTypeDao;

    @Override
    public PrivacyType save(PrivacyType privacyType) {
        return (PrivacyType) privacyTypeDao.save(privacyType);
    }

    @Override
    public boolean update(PrivacyType privacyType) {
        return privacyTypeDao.update(privacyType);
    }

    @Override
    public boolean delete(PrivacyType privacyType) throws Exception {
        return privacyTypeDao.delete(privacyType);
    }

    @Override
    public List<PrivacyType> getAllPrivacyTypes() {
        return privacyTypeDao.getAllPrivacyTypes();
    }
}
