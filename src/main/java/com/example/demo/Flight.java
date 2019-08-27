package com.example.demo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
public class Flight {

    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @NotNull
        @Size(min=4)
        private String airline;
        @NotNull
        @Size(min=3)
        private String departure;
        @NotNull
        @Size(min=10)
        private String destination;
        @NotNull
        @Size(min=3)
        private String date;
        @NotNull
        @Size(min=5)
        private String number;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

