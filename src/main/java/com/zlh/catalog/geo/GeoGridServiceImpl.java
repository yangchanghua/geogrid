package com.zlh.catalog.geo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoGridServiceImpl implements GeoGridService {

    @Override
    public List<GeoGrid> generateGridForCity(Point center, double gridSize, double outerPadding, int cnt) {
        return null;
    }

    @Override
    public GeoGrid locateAt(Point point) {
        return null;
    }
}
