package com.zlh.catalog.geo;

import org.springframework.data.geo.Point;

import java.util.List;

public interface GeoGridService {
    List<GeoGrid> generateGridForCity(String city, Point center, int gridSize, int width, int height);
}
