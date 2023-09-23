package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.movie.MovieRequestDto;
import com.example.bms_fair_begin.dtos.movie.MovieResponseDto;
import com.example.bms_fair_begin.models.Movie;
import com.example.bms_fair_begin.repositories.MovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    private ModelMapper modelMapper;
    private MovieRepository movieRepository;

    public MovieService(ModelMapper modelMapper, MovieRepository movieRepository) {
        this.modelMapper = modelMapper;
        this.movieRepository = movieRepository;
    }

    public MovieResponseDto saveMovie(Movie movieRequestDto) {

        Movie movie = movieRepository.save(movieRequestDto);
        MovieResponseDto movieResponseDto = modelMapper.map(movie,MovieResponseDto.class);
        return movieResponseDto;

    }

    public List<MovieResponseDto> getMovies() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieResponseDto> movieResponseDtos = Arrays.asList(modelMapper.map(movies,MovieResponseDto[].class));
        return movieResponseDtos;
    }
}
