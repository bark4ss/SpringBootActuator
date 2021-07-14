package com.example.actuator.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ticket_id")
    private Integer ticketId;

    @Column(name="passenger_name",nullable=false)
    private String passengerName;

    @Column(name="booking_date")
    private LocalDate bookingDate;

    @Column(name="source_station")
    private String sourceStation;

    @Column(name="dest_station")
    private String destStation;

    @Column(name="email")
    private String email;


    public Integer getTicketId() {
        return ticketId;
    }
    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public LocalDate getBookingDate() {
        return bookingDate;
    }
    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }
    public String getSourceStation() {
        return sourceStation;
    }
    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }
    public String getDestStation() {
        return destStation;
    }
    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", bookingDate=" + bookingDate
                + ", sourceStation=" + sourceStation + ", destStation=" + destStation + ", email=" + email + "]";
    }
}
