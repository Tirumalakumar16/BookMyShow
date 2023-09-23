package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.SeatStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeatInShow extends BaseModel {
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Seat seat;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private MovieShow show;
    @Enumerated(value = EnumType.ORDINAL)
     private SeatStatus seatStatus;
    private Date lockedAt;




}
