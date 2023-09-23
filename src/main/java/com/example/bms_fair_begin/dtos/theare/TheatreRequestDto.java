package com.example.bms_fair_begin.dtos.theare;

import com.example.bms_fair_begin.models.Theatre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TheatreRequestDto {

    private Theatre theatre;
}
