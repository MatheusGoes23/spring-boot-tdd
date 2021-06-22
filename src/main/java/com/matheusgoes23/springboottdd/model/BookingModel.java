package com.matheusgoes23.springboottdd.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BookingModel {

    private Long id;

    private String reserveName;

    private LocalDate checkIn;

    private LocalDate checkOut;

    private int numberGuests;
}
