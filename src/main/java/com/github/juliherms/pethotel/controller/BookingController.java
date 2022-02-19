package com.github.juliherms.pethotel.controller;

import com.github.juliherms.pethotel.dto.BookingDTO;
import com.github.juliherms.pethotel.model.Booking;
import com.github.juliherms.pethotel.service.BookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService service;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid BookingDTO bookingDTO){
        var booking = new Booking();
        BeanUtils.copyProperties(bookingDTO,booking);
        booking.setRegistration(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(booking));
    }
}
