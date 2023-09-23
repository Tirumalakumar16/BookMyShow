package com.example.bms_fair_begin.dtos.movie;

import com.example.bms_fair_begin.models.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieRequestDto {

    private Movie movie;
}
