package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.ShowStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
public class MovieShow extends BaseModel {

    @ManyToOne
    private Auditorium auditorium;
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;
    @Enumerated
    private ShowStatus showStatus;
    private int maxTickets;
    private int sessionTimeout;

    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<SeatInShow> seatInShows;
    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<SeatTypeInShow> seatTypeInShows;

}
