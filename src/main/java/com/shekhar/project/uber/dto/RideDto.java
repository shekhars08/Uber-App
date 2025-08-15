package com.shekhar.project.uber.dto;

import com.shekhar.project.uber.entities.enums.PaymentMethods;
import com.shekhar.project.uber.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;

public class RideDto {

    private Long id;

    private Point rideStartLocation;

    private Point RideEndLocation;

    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;

    private PaymentMethods paymentMethods;

    private RideStatus rideStatus;

    private double fare;

    private LocalDateTime rideStartTime;

    private LocalDateTime rideEndTime;
}