package com.example.bms_fair_begin.dtos.seat;

import com.example.bms_fair_begin.dtos.seatinshow.SeatInShowResponseDto;
import com.example.bms_fair_begin.models.SeatInShow;
import com.example.bms_fair_begin.models.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SeatResponseDto {

    private Long id;
    private String number;
    private int rowNum;
    private int colNum;

    private SeatType seatType;
    private List<SeatInShowResponseDto> seatInShows;


}
