package com.zlh.catalog.geo;

import org.springframework.data.geo.Point;

import java.util.List;

public interface GeoGridService {

    List<GeoGrid> generateGridForCity(Point center, double gridSize, double outerPadding, int cnt);
    GeoGrid locateAt(Point point);
}
