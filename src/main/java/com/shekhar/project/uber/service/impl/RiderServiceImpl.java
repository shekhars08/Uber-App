package com.shekhar.project.uber.service.impl;

import com.shekhar.project.uber.dto.DriverDto;
import com.shekhar.project.uber.dto.RideDto;
import com.shekhar.project.uber.dto.RideRequestDto;
import com.shekhar.project.uber.dto.RiderDto;
import com.shekhar.project.uber.service.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long driverId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getRiderProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllRidersRides() {
        return List.of();
    }
}