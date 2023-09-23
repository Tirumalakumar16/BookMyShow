package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.city.CityRequestDto;
import com.example.bms_fair_begin.dtos.city.CityResponseDto;
import com.example.bms_fair_begin.models.City;
import com.example.bms_fair_begin.repositories.CityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CityService {

    private ModelMapper modelMapper;
    private CityRepository cityRepository;
    @Autowired
    public CityService(ModelMapper modelMapper, CityRepository cityRepository) {
        this.modelMapper = modelMapper;
        this.cityRepository = cityRepository;
    }

    public CityResponseDto saveCity(City city) {

        City city1 = cityRepository.save(city);
        CityResponseDto responseDto = modelMapper.map(city1, CityResponseDto.class);
        return responseDto;
    }

    public List<CityResponseDto> getCities() {

        List<City> cities = cityRepository.findAll();
        List<CityResponseDto> responseDtos = Arrays.asList(modelMapper.map(cities,CityResponseDto[].class));
        return responseDtos;
    }
}
