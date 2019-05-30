package com.traveler.social.dao;


public interface BaseDao {
    Object save(Object obj);
    boolean update(Object obj);
    boolean delete(Object obj) throws Exception;
}
