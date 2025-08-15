package com.shekhar.project.uber.service;

import com.shekhar.project.uber.dto.DriverDto;
import com.shekhar.project.uber.dto.RideDto;
import com.shekhar.project.uber.dto.RideRequestDto;
import com.shekhar.project.uber.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    DriverDto rateDriver(Long driverId, Integer rating);

    RiderDto getRiderProfile();

    List<RideDto> getAllRidersRides();
}
