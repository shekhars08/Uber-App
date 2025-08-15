package com.shekhar.project.uber.dto;

import com.shekhar.project.uber.entities.enums.PaymentMethods;
import com.shekhar.project.uber.entities.enums.RideRequestStatus;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;

public class RideRequestDto {
    private Long id;

    private Point pickupPoint;

    private Point dropofPoint;

    private LocalDateTime requestTime;

    private RiderDto rider;

    private PaymentMethods paymentMethods;

    private RideRequestStatus rideRequestStatus;
}