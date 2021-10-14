package com.example.actuator.demo.dao;

import com.example.actuator.demo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingDao extends JpaRepository<Ticket, Integer> {
}
