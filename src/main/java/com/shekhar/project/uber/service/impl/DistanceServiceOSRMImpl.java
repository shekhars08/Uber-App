package com.shekhar.project.uber.service.impl;

import com.shekhar.project.uber.service.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dst) {
        return 0;
    }
}