package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeatTypeInShow extends BaseModel {
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private MovieShow show;
    private int price;

}
