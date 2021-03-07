package pricelistapp.pricelist.mapper;

import pricelistapp.pricelist.entity.UserEntity;
import pricelistapp.pricelist.model.RegisterUserDto;

public class UserMapper {

    public static UserEntity mapRegisterUserDtoToUserEntity(RegisterUserDto dto) {

        UserEntity entity = new UserEntity();
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());

        return entity;
    }
}
