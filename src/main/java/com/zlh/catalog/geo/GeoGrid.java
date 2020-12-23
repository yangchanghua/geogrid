package com.zlh.catalog.geo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoGrid {
    private Long id;
    private String city;
    private Point leftBottom;
    private Point rightTop;
}
