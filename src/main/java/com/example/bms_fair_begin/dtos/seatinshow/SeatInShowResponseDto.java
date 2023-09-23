package com.example.bms_fair_begin.dtos.seatinshow;

import com.example.bms_fair_begin.models.enums.SeatStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SeatInShowResponseDto {
    private Long id;
    private SeatStatus seatStatus;
}
