package com.zlh.catalog.geo;

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
     * @return 距离，单位公里
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
        return s;
    }

    public static double longitudeDiffPerKM(Point point) {
        double baseline = 0.1;
        Point pointRight = new Point(point.getX() + baseline, point.getY());
        double km = getDistance(point, pointRight);
        double diff = baseline / km;
        System.out.println("纬度差 " + baseline + ", 距离 " + km + ", 每千米差 " + diff);
        return diff;
    }

    public static double latitudeDiffPerKM(Point point) {
        double baseline = 0.1;
        Point pointAbove = new Point(point.getX(), point.getY() + baseline);
        double km = getDistance(point, pointAbove);
        double diff = baseline / km;
        System.out.println("经度差 " + baseline + ", 距离 " + km + ", 每千米差 " + diff);
        return diff;
    }

    public static Point pointWithDistance(Point point, double lngDelta, double latDelta) {
        return new Point(point.getX() + longitudeDiffPerKM(point) * lngDelta, point.getY() + longitudeDiffPerKM(point) * latDelta);
    }

    public static Point left(Point point, double km) {
        return new Point(point.getX() - longitudeDiffPerKM(point) * km, point.getY());
    }

    public static Point right(Point point, double km) {
        return new Point(point.getX() + longitudeDiffPerKM(point) * km, point.getY());
    }

    public static Point above(Point point, double km) {
        return new Point(point.getX(), point.getY() + latitudeDiffPerKM(point) * km);
    }

    public static Point below(Point point, double km) {
        return new Point(point.getX(), point.getY() - latitudeDiffPerKM(point) * km);
    }

    public static void main(String[] args) {
        Point p1 = new Point(104.066074,30.649986); //成都， 锦江宾馆地铁
        Point below = below(p1, 1); //往南一公里
        System.out.println("Point below " + below.getX() + ", " + below.getY());
        //104.066074, 30.64089509090909
    }
}
