package com.github.juliherms.pethotel.service;

import com.github.juliherms.pethotel.model.Booking;
import com.github.juliherms.pethotel.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repo;

    @Transactional
    public Booking save (Booking booking){
        return  repo.save(booking);
    }



}
