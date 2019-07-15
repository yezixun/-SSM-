package com.yezixun.test;

import com.yezixun.domain.Item;
import com.yezixun.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class TestSpringMybatis {
    @Autowired
    private ItemService itemService;

    @Test
    public void test(){
        Item item = itemService.findById(1);
        System.out.println("item = " + item);
    }
}
