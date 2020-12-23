package com.zlh.catalog.service;

import com.zlh.catalog.data.Kitchen;

import java.util.List;

public interface KitchenService {
    long addKitchen(Kitchen kitchen);
    void updateKitchen(Kitchen kitchen);
    void deleteKitchenById(long id);
    List<Kitchen> getKitchenByRadius(double longitude, double latitude, double km);

}
