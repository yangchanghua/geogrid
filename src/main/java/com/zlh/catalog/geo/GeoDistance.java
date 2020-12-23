package com.zlh.catalog.geo;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;

public class GeoDistance {

    private static double EARTH_RADIUS = 6371.393; //in km

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 计算两个经纬度之间的距离
     *
     * @param p1
     * @param p2
     * @return
     */
    public static double getDistance(Point p1, Point p2) {
        double lng1 = p1.getX();
        double lat1 = p1.getY();
        double lng2 = p2.getX();
        double lat2 = p2.getY();
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s);
        Distance distance = new Distance(s, Metrics.KILOMETERS);
        System.out.println(distance);
        return s;
    }

    public static Point leftOf(Point point, int km) {
        return null;
    }

    public static void main(String[] args) {
        Point p1 = new Point(104.065903,30.650077);
        Point p2 = new Point(104.066246,30.640625);
        Point p3 = new Point(106.500512,29.590176);
        System.out.println(getDistance(p1, p3));
    }
}
