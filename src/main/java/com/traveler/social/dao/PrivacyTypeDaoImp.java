package com.traveler.social.dao;

import com.traveler.social.models.entities.Post;
import com.traveler.social.models.entities.PrivacyType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrivacyTypeDaoImp extends BaseDaoImp implements PrivacyTypeDao{

    @Override
    public List<PrivacyType> getAllPrivacyTypes() {
        return super.getCurrentHibernateSession()
                .createQuery("from PrivacyType").list();
    }
}
