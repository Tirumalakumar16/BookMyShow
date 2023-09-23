package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.movieshow.MovieShowRequestDto;
import com.example.bms_fair_begin.dtos.movieshow.MovieShowResponseDto;
import com.example.bms_fair_begin.dtos.movieshow.MovieTimeResponse;
import com.example.bms_fair_begin.models.MovieShow;
import com.example.bms_fair_begin.repositories.MovieShowRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class MovieShowService {

    private ModelMapper modelMapper;
    private MovieShowRepository movieShowRepository;
    @Autowired
    public MovieShowService(ModelMapper modelMapper, MovieShowRepository movieShowRepository) {
        this.modelMapper = modelMapper;
        this.movieShowRepository = movieShowRepository;
    }


    public MovieShowResponseDto saveShow(MovieShow movieShow) {

        MovieShow show = movieShowRepository.save(movieShow);
        MovieShowResponseDto responseDto =  modelMapper.map(show,MovieShowResponseDto.class);
        return responseDto;
    }

    public List<MovieShowResponseDto> getShows() {

        List<MovieShow> show = movieShowRepository.findAll();
        List<MovieShowResponseDto> responseDtos = Arrays.asList(modelMapper.map(show,MovieShowResponseDto[].class));
        return responseDtos;
    }

    public MovieTimeResponse getTime(Long id) {

        MovieShow movie = movieShowRepository.findById(id).get();
        MovieTimeResponse response = new MovieTimeResponse();

        Date date = new Date();
        long milliSeconds = date.getTime();
        long second = milliSeconds/1000;
        long minutes = second/60;
        Date movieTime = movie.getEndTime();
        long movieTimeMilliSeconds = movieTime.getTime();
        long secondsMovieTime = movieTimeMilliSeconds/1000;
        long movieTimeMinutes = secondsMovieTime/60;
        long result = movieTimeMinutes-minutes;
        response.setTotal(result);
        response.setDate(movieTime);



        return response;

    }
}
