package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.city.CityResponseDto;
import com.example.bms_fair_begin.dtos.movie.MovieRequestDto;
import com.example.bms_fair_begin.dtos.movie.MovieResponseDto;
import com.example.bms_fair_begin.models.Movie;
import com.example.bms_fair_begin.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private MovieService movieService;
    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping("/movie")
    public MovieResponseDto saveMovie(@RequestBody MovieRequestDto movieRequestDto) {

        return movieService.saveMovie(movieRequestDto.getMovie());
    }

    @GetMapping("/movie")
    public List<MovieResponseDto> getMovies() {
        return movieService.getMovies();
    }
}
