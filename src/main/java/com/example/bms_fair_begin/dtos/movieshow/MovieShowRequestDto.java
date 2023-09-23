package com.example.bms_fair_begin.dtos.movieshow;

import com.example.bms_fair_begin.models.MovieShow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieShowRequestDto {

    private MovieShow movieShow;
}
