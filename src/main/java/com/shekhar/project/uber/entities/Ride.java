package com.shekhar.project.uber.entities;

import com.shekhar.project.uber.entities.enums.PaymentMethods;
import com.shekhar.project.uber.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point rideStartLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point RideEndLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethods;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private double fare;

    private LocalDateTime rideStartTime;

    private LocalDateTime rideEndTime;
}