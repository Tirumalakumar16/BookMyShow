package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.actor.ActorRequestDto;
import com.example.bms_fair_begin.dtos.actor.ActorResponseDto;
import com.example.bms_fair_begin.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActorController {

    private ActorService actorService;
    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @PostMapping("/actor")
    public ActorResponseDto saveActor(@RequestBody ActorRequestDto actorRequestDto) {
        return actorService.saveActor(actorRequestDto.getActor());
    }

    @GetMapping("/actor")
    public List<ActorResponseDto> getActors() {
        return actorService.getActors();
    }
}
