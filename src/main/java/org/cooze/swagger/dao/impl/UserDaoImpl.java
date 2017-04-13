package org.cooze.swagger.dao.impl;

import org.cooze.swagger.dao.UserDao;
import org.cooze.swagger.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User findUserByNameAndId(String name,Integer id) {
        return new User(name,id,2,"长得帅");
    }
}
