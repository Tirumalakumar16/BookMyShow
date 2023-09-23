package com.example.bms_fair_begin.dtos.movieshow;

import com.example.bms_fair_begin.dtos.seatinshow.SeatInShowResponseDto;
import com.example.bms_fair_begin.dtos.seattypeinshow.SeatTypeInShowResponseDto;
import com.example.bms_fair_begin.models.SeatInShow;
import com.example.bms_fair_begin.models.SeatTypeInShow;
import com.example.bms_fair_begin.models.enums.ShowStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieShowResponseDto {
    private Long id;
    private Date startTime;
    private Date endTime;
    private ShowStatus showStatus;
    private int maxTickets;
    private Date sessionTimeout;

    private List<SeatInShowResponseDto> seatInShows;
    private List<SeatTypeInShowResponseDto> seatTypeInShows;
}
