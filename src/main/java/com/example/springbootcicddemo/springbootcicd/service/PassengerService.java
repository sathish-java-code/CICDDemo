package com.example.springbootcicddemo.springbootcicd.service;

import com.example.springbootcicddemo.springbootcicd.model.passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {


    private List<passenger> passengerslist = new ArrayList<>();

    public List<passenger> getAllPassengers() {
        return passengerslist;
    }

    public passenger addpassenger(passenger newpassengers) {

        passengerslist.add(newpassengers);
        return newpassengers;


    }
}
