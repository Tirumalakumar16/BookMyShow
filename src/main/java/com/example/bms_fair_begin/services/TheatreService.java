package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.theare.TheatreResponse;
import com.example.bms_fair_begin.models.Theatre;
import com.example.bms_fair_begin.repositories.TheatreRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Arrays;
import java.util.List;

@Service
public class TheatreService {

    private ModelMapper modelMapper;
    private TheatreRepository theatreRepository;
    @Autowired
    public TheatreService(ModelMapper modelMapper, TheatreRepository theatreRepository) {
        this.modelMapper = modelMapper;
        this.theatreRepository = theatreRepository;
    }

    public TheatreResponse saveTheatre(Theatre theatre) {

        Theatre theatre1 = theatreRepository.save(theatre);
        TheatreResponse theatreResponse = modelMapper.map(theatre1,TheatreResponse.class);
        return theatreResponse;
    }

    public List<TheatreResponse> getTheatres() {

        List<Theatre> theatres = theatreRepository.findAll();
        List<TheatreResponse> responses = Arrays.asList(modelMapper.map(theatres,TheatreResponse[].class));
        return responses;
    }
}
