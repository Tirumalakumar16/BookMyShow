package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.dtos.seattypeinshow.AmountResponse;
import com.example.bms_fair_begin.exceptions.SeatNotAvailableException;
import com.example.bms_fair_begin.exceptions.UserNotFoundException;
import com.example.bms_fair_begin.models.*;
import com.example.bms_fair_begin.models.enums.SeatStatus;
import com.example.bms_fair_begin.models.enums.SeatType;
import com.example.bms_fair_begin.repositories.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TicketService {

    private TicketRepository ticketRepository;
    private ModelMapper modelMapper;

    private SeatInShowRepository seatInShowRepository;

    private UserRepository userRepository;

    private SeatTypeInShowRepository seatTypeInShowRepository;
    private SeatRepository seatRepository;
    @Autowired
    public TicketService(TicketRepository ticketRepository, ModelMapper modelMapper, SeatInShowRepository seatInShowRepository,
                         UserRepository userRepository, SeatTypeInShowRepository seatTypeInShowRepository, SeatRepository seatRepository) {
        this.ticketRepository = ticketRepository;
        this.modelMapper = modelMapper;
        this.seatInShowRepository = seatInShowRepository;
        this.userRepository = userRepository;
        this.seatTypeInShowRepository = seatTypeInShowRepository;
        this.seatRepository = seatRepository;
    }

    public Ticket bookTicket(List<Long> seatInShows, Long userId) throws UserNotFoundException, SeatNotAvailableException {

        List<SeatInShow> seats = seatInShowRepository.findAllById(seatInShows);



        for(SeatInShow seat : seats) {
            if(IsAvailable(seat) == false){

                throw new SeatNotAvailableException("Seat is not Available , please select other seats");
            }
        }

        Optional<User> userOptional = userRepository.findById(userId);

        if(userOptional.isEmpty()) {
            throw new UserNotFoundException("User in the User Data Base Not found, please sign-up with your email");
        }

        User updatedUser = userOptional.get();
        List<SeatInShow> updatedSeats = new ArrayList<>();
        Date current = new Date();
        List<Seat> seatsForPrices = new ArrayList<>();

        for(SeatInShow seat: seats) {

            seat.setSeatStatus(SeatStatus.Locked);
            seat.setLockedAt(current);
            seatsForPrices.add(seat.getSeat());
            SeatInShow seat1 = seatInShowRepository.save(seat);
            updatedSeats.add(seat1);
        }

        List<SeatType> seatTypeList = new ArrayList<>();

        for(Seat newseat: seatsForPrices) {
            seatTypeList.add(newseat.getSeatType());
        }

        List<Integer> prices = new ArrayList<>();
        for(Seat seat : seatsForPrices ) {
            if(seat.getSeatType().equals(SeatType.SILVER)) {
                SeatTypeInShow seatTypeInShow = seatTypeInShowRepository.findById(1l).get();
                prices.add(seatTypeInShow.getPrice());
            } else if (seat.getSeatType().equals(SeatType.GOLD)) {
                SeatTypeInShow seatTypeInShow = seatTypeInShowRepository.findById(2l).get();
                prices.add(seatTypeInShow.getPrice());
            } else {
                SeatTypeInShow seatTypeInShow = seatTypeInShowRepository.findById(3l).get();
                prices.add(seatTypeInShow.getPrice());
            }
        }
        int amount =0;
        for(Integer price : prices){
            amount+=price;
        }

        Ticket ticket = new Ticket();
        ticket.setBookTime(current);
        ticket.setUser(updatedUser);
        ticket.setAmount(amount);
        ticket.setSeatInShows(updatedSeats);

       Ticket savedTicket = ticketRepository.save(ticket);
        //System.out.println(savedTicket);

        return savedTicket;
    }

    private boolean IsAvailable(SeatInShow seat) {
        if(seat.getSeatStatus().equals(SeatStatus.Available)){
            return true;
        } else if(seat.getSeatStatus().equals(SeatStatus.Locked)){
            // logic
            // 9:10 pm on 23rd Aug 2023
            long lockedAt = seat.getLockedAt().getTime();
            long current = System.currentTimeMillis();

            long duration = current - lockedAt;
            long durationInSeconds = duration / 1000;
            long durationInMinutes = durationInSeconds/60;

            if(durationInMinutes >= 10){
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public void saveTicket(Ticket ticket) {
        List<Long> list = Arrays.asList(12l,13l);
        List<SeatInShow> seats = seatInShowRepository.findAllById(list);
        int i=0;
        for(SeatInShow seat :seats) {
            seat.setLockedAt(new Date());
            Seat seat1 = seatRepository.findById(list.get(i)).get();
            i++;
            seat.setSeat(seat1);
            seat.setSeatStatus(SeatStatus.Booked);
        }
        ticket.setSeatInShows((seats));

        ticketRepository.save(ticket);
    }
}
