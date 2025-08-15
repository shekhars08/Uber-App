package com.shekhar.project.uber.service;

import com.shekhar.project.uber.dto.RideRequestDto;
import com.shekhar.project.uber.entities.Driver;
import com.shekhar.project.uber.entities.Ride;
import com.shekhar.project.uber.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfRider(Long rideId, PageRequest pageRequest);
}