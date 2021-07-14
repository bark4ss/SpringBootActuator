package com.example.actuator.demo.controller;

import com.example.actuator.demo.model.Ticket;
import com.example.actuator.demo.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @PostMapping(value="/create")
    public Ticket createTicket(@RequestBody Ticket ticket){
        return ticketBookingService.createTicket(ticket);
    }

    @GetMapping(value="/ticket/{ticketId}")
    public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId){
        return ticketBookingService.getTicketById(ticketId);
    }
    @GetMapping(value="/ticket/alltickets")
    public Iterable<Ticket> getAllBookedTickets(){
        return ticketBookingService.getAllBookedTickets();
    }

    @DeleteMapping(value="/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId")Integer ticketId){
        ticketBookingService.deleteTicket(ticketId);
    }

    @PutMapping(value="/ticket/{ticketId}/{newEmail:.+}")
    public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail")String newEmail){
        return ticketBookingService.updateTicket(ticketId,newEmail);
    }
}
