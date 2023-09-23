package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.user.UserRequestDto;
import com.example.bms_fair_begin.dtos.user.UserResponseDto;
import com.example.bms_fair_begin.dtos.user.UserRolesRequestDto;
import com.example.bms_fair_begin.models.User;
import com.example.bms_fair_begin.models.enums.Role;
import com.example.bms_fair_begin.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    private ModelMapper modelMapper;
    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public UserResponseDto saveUser(User userRequestDto) {

        User save = userRepository.save(userRequestDto);
        UserResponseDto responseDto = modelMapper.map(save,UserResponseDto.class);
        return responseDto;
    }

    public List<UserResponseDto> getUsers() {
        List<User> users = userRepository.findAll();
        List<UserResponseDto> response = Arrays.asList(modelMapper.map(users,UserResponseDto[].class));
        return response;
    }

    public UserResponseDto saveRoles(UserRolesRequestDto userRolesRequestDto, Long userId) {

        User user = userRepository.findById(userId).get();
        user.setRoles(userRolesRequestDto.getRoles());
        UserResponseDto responseDto = modelMapper.map(user, UserResponseDto.class);
        return responseDto;
    }
}
