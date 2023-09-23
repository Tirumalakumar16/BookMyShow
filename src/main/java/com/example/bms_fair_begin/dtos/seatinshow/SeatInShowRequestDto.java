package com.example.bms_fair_begin.dtos.seatinshow;

import com.example.bms_fair_begin.models.SeatInShow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SeatInShowRequestDto {

    private SeatInShow seatInShow;
}
