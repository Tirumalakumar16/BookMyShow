package com.example.bms_fair_begin.dtos.movie;

import com.example.bms_fair_begin.dtos.actor.ActorResponseDto;
import com.example.bms_fair_begin.dtos.movieshow.MovieShowResponseDto;
import com.example.bms_fair_begin.models.Actor;
import com.example.bms_fair_begin.models.MovieShow;
import com.example.bms_fair_begin.models.enums.Features;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MovieResponseDto {

    private Long id;
    private String movieName;
    private List<Features> required;
    @JsonIgnore
    private List<ActorResponseDto> actor;
    @JsonIgnore
    private List<MovieShowResponseDto> shows;
    private int duration;
}
