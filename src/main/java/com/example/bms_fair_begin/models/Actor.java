package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Actor extends BaseModel {

        private String ActorName;
        @Enumerated(EnumType.ORDINAL)
        private Gender gender;
        private int age;
        @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
        private List<Movie> movies;


}
