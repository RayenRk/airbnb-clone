package org.example.airbnbcloneback.user.mapper;

import org.example.airbnbcloneback.user.application.dto.ReadUserDTO;
import org.example.airbnbcloneback.user.domain.Authority;
import org.example.airbnbcloneback.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }
}
