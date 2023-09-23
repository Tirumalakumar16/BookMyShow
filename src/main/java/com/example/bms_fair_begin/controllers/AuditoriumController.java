package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.actor.ActorResponseDto;
import com.example.bms_fair_begin.dtos.auditorium.AuditoriumRequestDto;
import com.example.bms_fair_begin.dtos.auditorium.AuditoriumResponseDto;
import com.example.bms_fair_begin.services.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuditoriumController {

    private AuditoriumService auditoriumService;
    @Autowired
    public AuditoriumController(AuditoriumService auditoriumService) {
        this.auditoriumService = auditoriumService;
    }
    @PostMapping("/auditorium")
    public AuditoriumResponseDto saveAuditorium(@RequestBody AuditoriumRequestDto requestDto) {

        return auditoriumService.saveAudi(requestDto.getAuditorium());
    }

    @GetMapping("/auditorium")
    public List<AuditoriumResponseDto> getAudis() {
        return auditoriumService.getAudis();
    }

}
