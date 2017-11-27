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
    Item item4;
    Customer customer1;
    Customer customer2;
    CheckOut checkOut;

    @Before
    public void before() {
        item1 = new Item("Cake", 600);
        item2 = new Item("Cereal", 350);
        item3 = new Item("Bananas", 250);
        item4 = new Item("Toaster", 1500);
        customer1 = new Customer(true);
        customer2 = new Customer(false);
        checkOut = new CheckOut();
    }

    @Test
    public void testCustomerInitialCost(){
        customer1.addItem(item1);
        customer1.addItem(item2);
        customer1.addItem(item3);
        assertEquals(1200, checkOut.getCost(customer1), 0.0);
    }

    @Test
    public void testHasLoyaltyCard(){
        assertEquals(true, checkOut.hasLoyaltyCard(customer1));
    }

    @Test
    public void testBuyOneGetOneFree(){
        customer1.addItem(item1);
        customer1.addItem(item1);
        assertEquals(2, customer1.getBasket().size());
    }

    @Test
    public void test10PercentDiscountOverSpending20(){
        customer1.addItem(item1);
        customer1.addItem(item2);
        customer1.addItem(item3);
        customer1.addItem(item4);
        assertEquals(2430, checkOut.getCost(customer1), 0.0);
    }

    @Test
    public void testLoyaltyDiscount(){
        customer1.addItem(item1);
        customer1.addItem(item2);
        customer1.addItem(item3);
        customer1.addItem(item4);
        assertEquals(2382, checkOut.getCost(customer1), 0.0);
//        checkOut.getLoyaltyDiscount(customer1);
//        assertEquals(2381, checkOut.getCost(customer1), 0.0);
    }


}
