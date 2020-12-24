package com.zlh.catalog.geo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;

import java.util.List;

public class GeoGridServiceImpl implements GeoGridService {

    @Override
    public List<GeoGrid> generateGridForCity(Point center, int gridSize, int outerPadding, int cnt) {
        return null;
    }

    @Override
    public GeoGrid locateAt(Point point) {
        return null;
    }
}
