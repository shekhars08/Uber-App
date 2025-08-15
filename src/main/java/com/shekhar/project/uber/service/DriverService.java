package com.shekhar.project.uber.service;

import com.shekhar.project.uber.dto.DriverDto;
import com.shekhar.project.uber.dto.RideDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long riderId, Integer rating);

    DriverDto getDriverProfile();

    List<RideDto> getAllDriverRides();
}
