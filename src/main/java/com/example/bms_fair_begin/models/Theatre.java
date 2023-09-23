package com.example.bms_fair_begin.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Entity
@ToString
public class Theatre extends BaseModel {
    private String name;
    private String address;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private City city;
    @OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Auditorium> auditoriums;
}
