package org.cooze.swagger.service;

import org.cooze.swagger.dto.UserDTO;


public interface UserService {

    UserDTO getUserByNameAndId(String name,Integer id);
}
