package com.example.bms_fair_begin.dtos.theare;

import com.example.bms_fair_begin.dtos.auditorium.AuditoriumResponseDto;
import com.example.bms_fair_begin.models.Auditorium;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TheatreResponse {
    private Long id;
    private String name;
    private String address;
    private List<AuditoriumResponseDto> auditoriums;
}
