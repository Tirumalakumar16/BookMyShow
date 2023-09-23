package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.Features;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Entity
@ToString
public class Movie extends BaseModel {

    private String movieName;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Features> required;

    @ManyToMany(mappedBy = "movies",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Actor> actor;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<MovieShow> shows;
    private int duration;
}
