package com.zlh.catalog.service;

import com.zlh.catalog.data.Kitchen;
import com.zlh.catalog.utils.KitchenGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KitchenServiceTest {

    @Autowired
    private KitchenService kitchenService;

    @Test
    public void addedKitchenShouldGotId() {
        Kitchen kitchen = KitchenGenerator.oneKitchen();
        long id = kitchenService.addKitchen(kitchen);
        Assertions.assertTrue(id > 0);
        System.out.println("ID for new Kitchen: " + id);
    }

}
