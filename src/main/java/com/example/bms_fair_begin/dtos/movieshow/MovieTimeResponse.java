package com.example.bms_fair_begin.dtos.movieshow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieTimeResponse {

    private Date date;

    private long total;
}
