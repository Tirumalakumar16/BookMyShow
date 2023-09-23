package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.user.UserRequestDto;
import com.example.bms_fair_begin.dtos.user.UserResponseDto;
import com.example.bms_fair_begin.dtos.user.UserRolesRequestDto;
import com.example.bms_fair_begin.models.enums.Role;
import com.example.bms_fair_begin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/user")
    public UserResponseDto saveUser(@RequestBody UserRequestDto userRequestDto) {

        return userService.saveUser(userRequestDto.getUser());
    }


    @GetMapping("/user")
    public ResponseEntity<List<UserResponseDto>> getUsers() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
    }
    @PutMapping("/user/{id}")
    public UserResponseDto saveUserRoles(@PathVariable("id") Long userId, @RequestBody UserRolesRequestDto userRolesRequestDto) {

        return userService.saveRoles(userRolesRequestDto,userId);
    }
}
