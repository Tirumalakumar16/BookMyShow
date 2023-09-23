package com.example.bms_fair_begin.dtos.seat;

import com.example.bms_fair_begin.models.Seat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SeatRequestDto {
    private Seat seat;
}
