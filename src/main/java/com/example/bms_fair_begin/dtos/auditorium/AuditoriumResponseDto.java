package com.example.bms_fair_begin.dtos.auditorium;

import com.example.bms_fair_begin.dtos.movieshow.MovieShowResponseDto;
import com.example.bms_fair_begin.dtos.seat.SeatResponseDto;
import com.example.bms_fair_begin.models.Auditorium;
import com.example.bms_fair_begin.models.MovieShow;
import com.example.bms_fair_begin.models.Seat;
import com.example.bms_fair_begin.models.enums.Features;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuditoriumResponseDto {

    private Long id;
    private String number;
    private int maxRows;
    private int maxColumns;
    private List<Features> supportedFeatures;
    private List<SeatResponseDto> seats;
    private List<MovieShowResponseDto> shows;
}
