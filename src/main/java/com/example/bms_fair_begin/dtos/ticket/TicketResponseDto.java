package com.example.bms_fair_begin.dtos.ticket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketResponseDto {

    private Date bookedTime;
    private int noOfTickets;
    private int amount_To_Be_Paid;
    private TicketMessage status;
}
