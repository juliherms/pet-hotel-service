package com.github.juliherms.pethotel.controller;

import com.github.juliherms.pethotel.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService service;


}
