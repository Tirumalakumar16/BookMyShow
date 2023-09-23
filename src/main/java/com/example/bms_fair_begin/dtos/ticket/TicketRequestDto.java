package com.example.bms_fair_begin.dtos.ticket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketRequestDto {

    private List<Long> seatInShows;

    private Long userId;


}
