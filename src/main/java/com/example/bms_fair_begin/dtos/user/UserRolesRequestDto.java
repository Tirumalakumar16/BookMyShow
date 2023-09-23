package com.example.bms_fair_begin.dtos.user;

import com.example.bms_fair_begin.models.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRolesRequestDto {

    private List<Role> roles;
}
