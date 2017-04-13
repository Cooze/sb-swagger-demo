package org.cooze.swagger.dao;

import org.cooze.swagger.domain.User;


public interface UserDao {
    User findUserByNameAndId(String name,Integer id);
}
