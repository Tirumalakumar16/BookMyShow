package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.seattypeinshow.AmountResponse;
import com.example.bms_fair_begin.dtos.seattypeinshow.SeatTypeInShowRequestDto;
import com.example.bms_fair_begin.dtos.seattypeinshow.SeatTypeInShowResponseDto;
import com.example.bms_fair_begin.models.SeatTypeInShow;
import com.example.bms_fair_begin.services.SeatTypeInShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatTypeInShowController {


    private SeatTypeInShowService seatTypeInShowService;
    @Autowired
    public SeatTypeInShowController(SeatTypeInShowService seatTypeInShowService) {
        this.seatTypeInShowService = seatTypeInShowService;
    }

    @PostMapping("/seat_type")
    public ResponseEntity<SeatTypeInShowResponseDto> saveSeatType(@RequestBody SeatTypeInShowRequestDto seatTypeInShowRequestDto) {

        return ResponseEntity.status(HttpStatus.OK).body(seatTypeInShowService.saveSeatType(seatTypeInShowRequestDto.getSeatTypeInShow()));
    }
    @GetMapping("/seat_type")
    public List<SeatTypeInShowResponseDto> getListOfSeatTypes() {

        return seatTypeInShowService.getListOfSeatTypes();
    }


}
