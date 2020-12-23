package com.zlh.catalog.geo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeoPoint {
    private double longitude;
    private double latitude;
}
