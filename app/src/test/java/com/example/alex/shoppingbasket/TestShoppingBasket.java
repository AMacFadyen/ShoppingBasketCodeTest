package com.example.alex.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Alex on 25/11/2017.
 */

public class TestShoppingBasket {

    Item item1;
    Item item2;
    Item item3;
    ShoppingBasket basket;

    @Before
    public void before(){
        item1 = new Item("Cake", 600);
        item2 = new Item("Cereal", 350);
        item3 = new Item("Bananas", 250);
        basket = new ShoppingBasket();
    }

    @Test
    public void testBasketStartsEmpty(){
        assertEquals(0, basket.getContainer().size());
    }

    @Test
    public void testAddItemtoBasket(){
        basket.addItem(item2);
        basket.addItem(item1);
        assertEquals(2, basket.getContainer().size());
    }

    @Test
    public void testTotalBasketSum(){
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(1200, basket.getTotalCost(), 0.0);
    }

    @Test
    public void testRemoveItem(){
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.removeItem(item3);
        assertEquals(2, basket.getContainer().size());
        assertEquals(950, basket.getTotalCost(), 0.0);
    }

    @Test
    public void testClearBasket(){
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.empty();
        assertEquals(0, basket.getContainer().size());
        assertEquals(0, basket.getTotalCost(), 0.0);
    }

}
