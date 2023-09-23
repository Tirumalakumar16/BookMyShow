package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.theare.TheatreRequestDto;
import com.example.bms_fair_begin.dtos.theare.TheatreResponse;
import com.example.bms_fair_begin.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheatreController {

    private TheatreService theatreService;
    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @PostMapping("/theatre")
    public TheatreResponse saveTheatre(@RequestBody TheatreRequestDto requestDto) {

        return theatreService.saveTheatre(requestDto.getTheatre());
    }
    @GetMapping("/theatre")
    public ResponseEntity<List<TheatreResponse>> getTheatres() {

        return ResponseEntity.status(HttpStatus.OK).body(theatreService.getTheatres());
    }
}
