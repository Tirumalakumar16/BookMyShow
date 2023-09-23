package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.actor.ActorResponseDto;
import com.example.bms_fair_begin.models.Actor;
import com.example.bms_fair_begin.repositories.ActorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ActorService {

    private ModelMapper modelMapper;
    private ActorRepository actorRepository;
    @Autowired
    public ActorService(ModelMapper modelMapper, ActorRepository actorRepository) {
        this.modelMapper = modelMapper;
        this.actorRepository = actorRepository;
    }

    public ActorResponseDto saveActor(Actor actor) {

        Actor actor1 = actorRepository.save(actor);
        ActorResponseDto actorResponseDto = modelMapper.map(actor1,ActorResponseDto.class);
        return actorResponseDto;
    }

    public List<ActorResponseDto> getActors() {

        List<Actor> actor1 = actorRepository.findAll();
        List<ActorResponseDto> actorResponseDto = Arrays.asList(modelMapper.map(actor1,ActorResponseDto[].class));
        return actorResponseDto;
    }
}
