package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.seat.SeatResponseDto;
import com.example.bms_fair_begin.models.Seat;
import com.example.bms_fair_begin.repositories.SeatRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SeatService {

    private SeatRepository seatRepository;
    private ModelMapper modelMapper;
    @Autowired
    public SeatService(SeatRepository seatRepository, ModelMapper modelMapper) {
        this.seatRepository = seatRepository;
        this.modelMapper = modelMapper;
    }

    public SeatResponseDto saveSeat(Seat seat) {
        Seat seat1 = seatRepository.save(seat);
        SeatResponseDto responseDto = modelMapper.map(seat1,SeatResponseDto.class);
        return responseDto;
    }

    public List<SeatResponseDto> getSeats() {
        List<Seat> seats = seatRepository.findAll();
        List<SeatResponseDto> seatResponseDtos = Arrays.asList(modelMapper.map(seats,SeatResponseDto[].class));



        return seatResponseDtos;
    }
}
