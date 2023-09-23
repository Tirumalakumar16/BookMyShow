package com.example.bms_fair_begin.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends BaseModel {

    private int amount;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User user;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<SeatInShow> seatInShows;
    private Date bookTime;
    @OneToOne(mappedBy = "ticket",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Payment payment;
}
