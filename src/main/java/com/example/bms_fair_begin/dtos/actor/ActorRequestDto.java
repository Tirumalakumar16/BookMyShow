package com.example.bms_fair_begin.dtos.actor;

import com.example.bms_fair_begin.models.Actor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ActorRequestDto {

    private Actor actor;
}
