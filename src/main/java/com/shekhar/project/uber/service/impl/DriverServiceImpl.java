package com.shekhar.project.uber.service.impl;

import com.shekhar.project.uber.dto.DriverDto;
import com.shekhar.project.uber.dto.RideDto;
import com.shekhar.project.uber.service.DriverService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
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
    public RideDto rateRider(Long riderId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getDriverProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllDriverRides() {
        return List.of();
    }
}