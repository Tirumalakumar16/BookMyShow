package com.example.bms_fair_begin.dtos.seattypeinshow;

import com.example.bms_fair_begin.models.SeatTypeInShow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SeatTypeInShowRequestDto {

    private SeatTypeInShow seatTypeInShow;
}
