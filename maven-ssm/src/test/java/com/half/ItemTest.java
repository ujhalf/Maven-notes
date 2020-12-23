package com.half;

import com.half.domain.Item;
import com.half.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 17:31
 * @Version 1.0
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"} )
public class ItemTest {
    @Autowired
    ItemService itemService;
    @Test
    public void findById() {
        Item item = itemService.findById(1);
        System.out.println(item);

    }
}
