package pricelistapp.pricelist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pricelistapp.pricelist.entity.UserEntity;
import pricelistapp.pricelist.mapper.UserMapper;
import pricelistapp.pricelist.model.RegisterUserDto;
import pricelistapp.pricelist.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(RegisterUserDto userDto) {

        UserEntity entity = UserMapper.mapRegisterUserDtoToUserEntity(userDto);

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        entity.setPassword(passwordEncoder.encode(userDto.getPassword()));

        userRepository.save(entity);
    }
    public UserEntity findByUsername(String username){
        return userRepository.findByUsername(username);
    }

}


