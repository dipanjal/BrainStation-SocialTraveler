package com.traveler.social.dao;

import org.springframework.stereotype.Repository;

public interface BaseDao {
    Object save(Object obj);
    boolean update(Object obj);
    boolean delete(Object obj) throws Exception;
}
