package com.github.juliherms.pethotel.service;

import com.github.juliherms.pethotel.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repo;



}
