package com.example.actuator.demo.service;

import com.example.actuator.demo.dao.TicketBookingDao;
import com.example.actuator.demo.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {

    @Autowired
    private TicketBookingDao ticketBookingDao;

    public Ticket createTicket(Ticket ticket) {
        return ticketBookingDao.save(ticket);
    }

    public Ticket getTicketById(Integer ticketId) {
        return ticketBookingDao.findById(ticketId).get();
    }
    public Iterable<Ticket> getAllBookedTickets() {
        return ticketBookingDao.findAll();
    }
    public void deleteTicket(Integer ticketId) {
        ticketBookingDao.delete(ticketBookingDao.findById(ticketId).get());
    }
    public Ticket updateTicket(Integer ticketId, String newEmail) {
        Ticket ticketFromDb = ticketBookingDao.findById(ticketId).get();
        ticketFromDb.setEmail(newEmail);
        return ticketBookingDao.save(ticketFromDb);
    }

}
