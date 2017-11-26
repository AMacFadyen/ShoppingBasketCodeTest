package com.example.alex.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Alex on 25/11/2017.
 */


public class TestItem {

    Customer customer;
    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before(){
        item1 = new Item("Cake", 600);
        item2 = new Item("Cereal", 350);
        item3 = new Item("Bananas", 300);
    }

    @Test
    public void testGetItemName(){
        assertEquals("Cake", item1.getName());
    }

    @Test
    public void testGetItemCost(){
        assertEquals(350, item2.getValue(), 0.0);
    }

}
