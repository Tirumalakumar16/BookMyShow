package com.example.bms_fair_begin.dtos.city;

import com.example.bms_fair_begin.models.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CityRequestDto {

    private City city;
}
