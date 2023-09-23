package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.seattypeinshow.SeatTypeInShowResponseDto;
import com.example.bms_fair_begin.models.SeatTypeInShow;
import com.example.bms_fair_begin.repositories.SeatTypeInShowRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SeatTypeInShowService {

    private ModelMapper modelMapper;

    private SeatTypeInShowRepository seatTypeInShowRepository;
    @Autowired
    public SeatTypeInShowService(ModelMapper modelMapper, SeatTypeInShowRepository seatTypeInShowRepository) {
        this.modelMapper = modelMapper;
        this.seatTypeInShowRepository = seatTypeInShowRepository;
    }

    public SeatTypeInShowResponseDto saveSeatType(SeatTypeInShow seatTypeInShow) {

        SeatTypeInShow save = seatTypeInShowRepository.save(seatTypeInShow);

        SeatTypeInShowResponseDto response = modelMapper.map(save, SeatTypeInShowResponseDto.class);

        return response;
    }

    public List<SeatTypeInShowResponseDto> getListOfSeatTypes() {

        List<SeatTypeInShow> all = seatTypeInShowRepository.findAll();

        List<SeatTypeInShowResponseDto> listResponse = Arrays.asList(modelMapper.map(all,SeatTypeInShowResponseDto[].class));

        return listResponse;
    }
}
