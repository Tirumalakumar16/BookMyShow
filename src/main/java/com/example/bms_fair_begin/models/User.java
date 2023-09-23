package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Entity
@ToString
public class User extends BaseModel {

    private String name;
    private String userName;
    private String password;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Role> roles;
    private String phoneNumber;

}
