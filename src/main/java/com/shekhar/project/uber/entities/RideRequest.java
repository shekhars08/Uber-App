package com.shekhar.project.uber.entities;

import com.shekhar.project.uber.entities.enums.PaymentMethods;
import com.shekhar.project.uber.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupPoint;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropofPoint;

    @CreationTimestamp
    private LocalDateTime requestTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethods;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;
}