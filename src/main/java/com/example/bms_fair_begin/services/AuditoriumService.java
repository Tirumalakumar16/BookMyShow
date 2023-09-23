package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.auditorium.AuditoriumResponseDto;
import com.example.bms_fair_begin.models.Auditorium;
import com.example.bms_fair_begin.repositories.AuditoriumRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AuditoriumService {

    private ModelMapper modelMapper;
    private AuditoriumRepository auditoriumRepository;
    @Autowired
    public AuditoriumService(ModelMapper modelMapper, AuditoriumRepository auditoriumRepository) {
        this.modelMapper = modelMapper;
        this.auditoriumRepository = auditoriumRepository;
    }

    public AuditoriumResponseDto saveAudi(Auditorium auditorium) {
        Auditorium auditorium1 = auditoriumRepository.save(auditorium);

        AuditoriumResponseDto auditoriumResponseDto = modelMapper.map(auditorium1,AuditoriumResponseDto.class);
        return auditoriumResponseDto;
    }

    public List<AuditoriumResponseDto> getAudis() {
        List<Auditorium> auditorium1 = auditoriumRepository.findAll();
        List<AuditoriumResponseDto> auditoriumResponseDto = Arrays.asList( modelMapper.map(auditorium1,AuditoriumResponseDto[].class));
        return auditoriumResponseDto;


    }
}
