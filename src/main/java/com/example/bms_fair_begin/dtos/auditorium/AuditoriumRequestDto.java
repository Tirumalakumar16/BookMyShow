package com.example.bms_fair_begin.dtos.auditorium;

import com.example.bms_fair_begin.models.Auditorium;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuditoriumRequestDto {

    private Auditorium auditorium;

}
