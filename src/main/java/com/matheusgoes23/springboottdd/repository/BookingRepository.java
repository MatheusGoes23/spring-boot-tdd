package com.matheusgoes23.springboottdd.repository;

import com.matheusgoes23.springboottdd.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookingModel, Long> {

    Optional<BookingModel> findByReserveName(String name);
}
