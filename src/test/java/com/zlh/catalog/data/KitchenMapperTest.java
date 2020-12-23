package com.zlh.catalog.data;

import com.zlh.catalog.utils.KitchenGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class KitchenMapperTest {

    @Autowired
    private KitchenMapper kitchenMapper;

    @Test
    public void testInsert() {
        List<Kitchen> kitchens = KitchenGenerator.randomKitchens(10000);
        kitchens.forEach(kitchenMapper::insert);
    }
}
