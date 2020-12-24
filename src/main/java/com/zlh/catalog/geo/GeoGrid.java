package com.zlh.catalog.geo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;
import org.springframework.data.geo.Polygon;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoGrid {
    private Point topLeft;
    private Point bottomRight;
    private Point outerTL;
    private Point outerBR;
}
