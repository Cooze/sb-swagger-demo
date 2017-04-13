package org.cooze.swagger.service.impl;

import org.cooze.swagger.dao.UserDao;
import org.cooze.swagger.domain.User;
import org.cooze.swagger.dto.UserDTO;
import org.cooze.swagger.mapper.Domain2DTOMapper;
import org.cooze.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDTO getUserByNameAndId(String name,Integer id) {
        User user = this.userDao.findUserByNameAndId(name,id);
        return Domain2DTOMapper.userDomain2userDTO(user);
    }
}
