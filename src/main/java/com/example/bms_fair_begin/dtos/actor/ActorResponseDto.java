package com.example.bms_fair_begin.dtos.actor;

import com.example.bms_fair_begin.dtos.movie.MovieResponseDto;
import com.example.bms_fair_begin.models.Movie;
import com.example.bms_fair_begin.models.enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ActorResponseDto {

    private Long id;
    private String ActorName;
    private Gender gender;
    private int age;
    @JsonIgnore
    private List<MovieResponseDto> movies;
}
