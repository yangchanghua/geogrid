package com.zlh.catalog.service;

import com.zlh.catalog.data.Kitchen;
import com.zlh.catalog.data.KitchenMapper;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitchenServiceImpl implements KitchenService {

    @Autowired
    private KitchenMapper kitchenMapper;

    @Autowired
    RedissonClient redissonClient;

    @Override
    public long addKitchen(Kitchen kitchen) {
        kitchenMapper.insert(kitchen);
        return kitchen.getId();
    }

    @Override
    public void updateKitchen(Kitchen kitchen) {

    }

    @Override
    public void deleteKitchenById(long id) {

    }

    @Override
    public List<Kitchen> getKitchenByRadius(double longitude, double latitude, double km) {
        return null;
    }
}
