package com.example.alex.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 26/11/2017.
 */

public class TestCheckOut {

    Item item1;
    Item item2;
    Item item3;
    Customer customer1;
    Customer customer2;
    CheckOut checkOut;

    @Before
    public void before() {
        item1 = new Item("Cake", 600);
        item2 = new Item("Cereal", 350);
        item3 = new Item("Bananas", 250);
        customer1 = new Customer(true);
        customer2 = new Customer(false);
        checkOut = new CheckOut();
    }

    @Test
    public void testCustomerInitialCost(){
        customer1.addItem(item1);
        customer1.addItem(item2);
        customer1.addItem(item3);
        assertEquals(1200, checkOut.getTotalCost(customer1), 0.0);
    }

    @Test
    public void testHasLoyaltyCard(){
        assertEquals(true, checkOut.hasLoyaltyCard(customer1));
    }
}
