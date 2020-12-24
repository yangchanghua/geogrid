package com.zlh.catalog.geo;

import org.junit.jupiter.api.Assertions;
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
    public void generatedGridShouldHaveCorrectCount() {
        Point center = new Point(104.065774,30.657362); //成都， 天府广场
        int cnt = 20;
        int rows = cnt * 2 + 1;
        List<GeoGrid> grids = geoGridService.generateGridForCity(center, 2, 10, cnt);
        Assertions.assertNotNull(grids);
        Assertions.assertEquals(rows * rows, grids.size());
    }

    @Test
    public void generatedGridShouldHaveCorrectSize() {
        //生成的网格应该有正确的大小
    }

    @Test
    public void GivenPointShouldBeLocatedAtCorrectGrid() {
        //给定一个point，应该找到其所在的grid
    }
}
