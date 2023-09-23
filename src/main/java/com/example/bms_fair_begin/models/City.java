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
public class City extends BaseModel {
    private  String cityName;

    @OneToMany(cascade = CascadeType.ALL,targetEntity = Theatre.class,fetch = FetchType.LAZY,
    mappedBy = "city")
    private List<Theatre> theatres;
}
