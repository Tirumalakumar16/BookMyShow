package com.example.bms_fair_begin.dtos.ticket;

import com.example.bms_fair_begin.models.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketRequestRealDto {

    private Ticket ticket;


}
