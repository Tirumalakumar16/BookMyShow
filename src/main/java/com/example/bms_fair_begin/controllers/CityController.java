package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.auditorium.AuditoriumResponseDto;
import com.example.bms_fair_begin.dtos.city.CityRequestDto;
import com.example.bms_fair_begin.dtos.city.CityResponseDto;
import com.example.bms_fair_begin.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    private CityService cityService;
    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @PostMapping("/city")
    public CityResponseDto saveCity(@RequestBody CityRequestDto cityRequestDto) {

        return cityService.saveCity(cityRequestDto.getCity());
    }

    @GetMapping("/city")
    public List<CityResponseDto> getCities() {
        return cityService.getCities();
    }
}
