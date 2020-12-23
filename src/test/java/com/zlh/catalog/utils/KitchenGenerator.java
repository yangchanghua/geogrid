package com.zlh.catalog.utils;

import com.zlh.catalog.data.Kitchen;
import org.redisson.api.GeoPosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KitchenGenerator {

    private static final GeoPosition bottomLeft = new GeoPosition(103.935272,30.564319);
    private static final GeoPosition topRight = new GeoPosition(104.194824,30.776932);

    public static List<GeoPosition> randomPositions(int cnt) {
        Random random = new Random(1L);
        double[] xs = random.doubles(cnt, bottomLeft.getLongitude(), topRight.getLongitude()).toArray();
        double[] ys = random.doubles(cnt, bottomLeft.getLatitude(), topRight.getLatitude()).toArray();
        List<GeoPosition> positions = new ArrayList<>();
        while(--cnt >= 0) {
            positions.add(new GeoPosition(xs[cnt], ys[cnt]));
        }
        return positions;
    }

    public static Kitchen oneKitchen() {
        List<GeoPosition> positions = randomPositions(1);
        return new Kitchen(
                    null, "厨房--", "成都", "成都市区", "未知地址",
                    positions.get(0).getLongitude(), positions.get(0).getLatitude()
        );
    }

    public static List<Kitchen> randomKitchens(int cnt) {
        List<GeoPosition> positions = randomPositions(cnt);
        List<Kitchen> kitchens = new ArrayList<>();
        for (int i=0; i<cnt; i++) {
            kitchens.add(new Kitchen(
                    null, "厨房" + i, "成都", "成都市区", "未知地址",
                    positions.get(i).getLongitude(), positions.get(i).getLatitude()
            ));
        }
        return kitchens;
    }
}
