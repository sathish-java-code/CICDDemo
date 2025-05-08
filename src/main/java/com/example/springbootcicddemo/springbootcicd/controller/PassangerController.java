package com.example.springbootcicddemo.springbootcicd.controller;

import com.example.springbootcicddemo.springbootcicd.model.passenger;
import com.example.springbootcicddemo.springbootcicd.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PassangerController {
    @Autowired
    private PassengerService passengerService;


    @GetMapping("/get")
    public List<passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @PostMapping("/add")
    public passenger addPassenger( @RequestBody  passenger newpassengers) {
        return passengerService.addpassenger(newpassengers);
    }






}
