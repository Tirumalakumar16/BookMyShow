package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.seat.SeatRequestDto;
import com.example.bms_fair_begin.dtos.seat.SeatResponseDto;
import com.example.bms_fair_begin.dtos.seatinshow.SeatInShowRequestDto;
import com.example.bms_fair_begin.services.SeatInShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatInShowController {

    private SeatInShowService seatInShowService;
    @Autowired
    public SeatInShowController(SeatInShowService seatInShowService) {
        this.seatInShowService = seatInShowService;
    }
    @PostMapping("/seatinshow")
    public SeatResponseDto saveSeatInShow(@RequestBody SeatInShowRequestDto seatInShowRequestDto) {

        return seatInShowService.saveSeatInShow(seatInShowRequestDto.getSeatInShow());
    }

    @GetMapping("/seatinshow")
    public List<SeatResponseDto> getSeatInShow() {
        return seatInShowService.getSeatInShow();
    }
}
