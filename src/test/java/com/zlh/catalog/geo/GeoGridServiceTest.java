package com.zlh.catalog.geo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.geo.Point;

import java.util.List;

@SpringBootTest
public class GeoGridServiceTest {

    @Autowired
    private GeoGridService geoGridService;

    @Test
    public void generatedGridShouldCoverTheCity() {
        Point center = new Point(104.065774,30.657362); //成都， 天府广场
        List<GeoGrid> grids = geoGridService.generateGridForCity(center, 10)
    }
}
