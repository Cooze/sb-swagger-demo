package org.cooze.swagger.mapper;

import org.cooze.swagger.domain.User;
import org.cooze.swagger.dto.UserDTO;

public class Domain2DTOMapper {
    private Domain2DTOMapper(){}

    public static UserDTO userDomain2userDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(user.getAge());
        userDTO.setDesc(user.getDesc());
        userDTO.setName(user.getName());
        return userDTO;
    }
}
