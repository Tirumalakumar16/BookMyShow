package com.example.bms_fair_begin.dtos.city;

import com.example.bms_fair_begin.dtos.theare.TheatreResponse;
import com.example.bms_fair_begin.models.City;
import com.example.bms_fair_begin.models.Theatre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CityResponseDto {
    private Long id;
    private  String cityName;

    private List<TheatreResponse> theatres;
}
