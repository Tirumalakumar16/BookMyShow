package com.example.bms_fair_begin.dtos.user;

import com.example.bms_fair_begin.models.enums.Role;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponseDto {

    private Long id;
    private String name;
    private String userName;
    private String password;
    private String phoneNumber;

    private List<Role> roles;
}
