package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.ticket.TicketMessage;
import com.example.bms_fair_begin.dtos.ticket.TicketRequestDto;
import com.example.bms_fair_begin.dtos.ticket.TicketRequestRealDto;
import com.example.bms_fair_begin.dtos.ticket.TicketResponseDto;
import com.example.bms_fair_begin.models.Ticket;
import com.example.bms_fair_begin.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController

public class TicketController {

    private TicketService ticketService;
    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/ticket")
    public TicketResponseDto BookTicket(@RequestBody TicketRequestDto ticketRequestDto) {
        TicketResponseDto responseDto = new TicketResponseDto();
        try {
            Date date = new Date();
            Ticket ticket = ticketService.bookTicket(ticketRequestDto.getSeatInShows(),ticketRequestDto.getUserId());
            responseDto.setNoOfTickets(ticketRequestDto.getSeatInShows().size());
            responseDto.setBookedTime(date);
            responseDto.setStatus(TicketMessage.SUCCESS);
            responseDto.setAmount_To_Be_Paid(ticket.getAmount());
        } catch (Exception e) {
            responseDto.setStatus(TicketMessage.FAILURE);
        }

        return responseDto;
    }

    @PutMapping("/ticket")
    public String saveTicket(@RequestBody TicketRequestRealDto requestRealDto) {

        ticketService.saveTicket(requestRealDto.getTicket());
        return "saved successfully";
    }



}
