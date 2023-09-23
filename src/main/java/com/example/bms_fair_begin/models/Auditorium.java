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
public class Auditorium extends BaseModel {
    private String number;
    private int maxRows;
    private int maxColumns;
    @ManyToOne
    private Theatre theatre;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Features> supportedFeatures;
    @OneToMany(mappedBy = "auditorium",cascade = CascadeType.ALL)
    private List<Seat> seats;
    @OneToMany(cascade = CascadeType.ALL,targetEntity = MovieShow.class
    ,fetch = FetchType.LAZY,mappedBy = "auditorium")
    private List<MovieShow> shows;

}
