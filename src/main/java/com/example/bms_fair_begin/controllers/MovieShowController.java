package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.movie.MovieResponseDto;
import com.example.bms_fair_begin.dtos.movieshow.MovieShowRequestDto;
import com.example.bms_fair_begin.dtos.movieshow.MovieShowResponseDto;
import com.example.bms_fair_begin.dtos.movieshow.MovieTimeResponse;
import com.example.bms_fair_begin.services.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieShowController {

    private MovieShowService movieShowService;
    @Autowired
    public MovieShowController(MovieShowService movieShowService) {
        this.movieShowService = movieShowService;
    }
    @PostMapping("/show")
    public MovieShowResponseDto saveShow(@RequestBody MovieShowRequestDto movieShowRequestDto) {

        return movieShowService.saveShow(movieShowRequestDto.getMovieShow());
    }

    @GetMapping("/show")
    public List<MovieShowResponseDto> getShows() {
        return movieShowService.getShows();
    }
    @GetMapping("/show/{id}")
    public MovieTimeResponse getTime(@PathVariable("id") Long id) {

        return movieShowService.getTime(id);
    }
}
