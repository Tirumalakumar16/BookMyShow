package com.example.bms_fair_begin.dtos.user;

import com.example.bms_fair_begin.models.User;
import com.example.bms_fair_begin.models.enums.Role;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequestDto {

   private User user;
}
