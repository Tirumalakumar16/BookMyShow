package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.seat.SeatResponseDto;
import com.example.bms_fair_begin.models.SeatInShow;
import com.example.bms_fair_begin.repositories.SeatInShowRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SeatInShowService {

    private SeatInShowRepository seatInShowRepository;
    private ModelMapper modelMapper;
    @Autowired
    public SeatInShowService(SeatInShowRepository seatInShowRepository, ModelMapper modelMapper) {
        this.seatInShowRepository = seatInShowRepository;
        this.modelMapper = modelMapper;
    }

    public SeatResponseDto saveSeatInShow(SeatInShow seatInShow) {

        SeatInShow seat = seatInShowRepository.save(seatInShow);
        SeatResponseDto seatResponseDto = modelMapper.map(seat,SeatResponseDto.class);
        return seatResponseDto;
    }

    public List<SeatResponseDto> getSeatInShow() {
        List<SeatInShow> seatInShows = seatInShowRepository.findAll();
        List<SeatResponseDto> seatResponseDtos = Arrays.asList(modelMapper.map(seatInShows,SeatResponseDto[].class));
        return seatResponseDtos;
    }
}
