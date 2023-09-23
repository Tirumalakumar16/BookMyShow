package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Seat extends BaseModel {

    private String number;
    private int rowNum;
    private int colNum;
    @ManyToOne
    private Auditorium auditorium;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    @OneToMany(mappedBy = "seat",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<SeatInShow> seatInShows;
}
