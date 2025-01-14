package com.example.CabXpress.controller;

import com.example.CabXpress.dto.request.BookingRequest;
import com.example.CabXpress.dto.response.BookingResponse;
import com.example.CabXpress.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping
    public ResponseEntity bookCab(@RequestBody BookingRequest bookingRequest) {
        try {
            BookingResponse response = bookingService.bookCab(bookingRequest);
            return new ResponseEntity(response,HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
