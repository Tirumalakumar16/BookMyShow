package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.movie.MovieRequestDto;
import com.example.bms_fair_begin.dtos.movie.MovieResponseDto;
import com.example.bms_fair_begin.dtos.seat.SeatRequestDto;
import com.example.bms_fair_begin.dtos.seat.SeatResponseDto;
import com.example.bms_fair_begin.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatController {

    private SeatService seatService;
    @Autowired
    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @PostMapping("/seat")
    public SeatResponseDto saveSeat(@RequestBody SeatRequestDto seatRequestDto) {

        return seatService.saveSeat(seatRequestDto.getSeat());
    }

    @GetMapping("/seat")
    public List<SeatResponseDto> getSeats() {
        return seatService.getSeats();
    }
}
