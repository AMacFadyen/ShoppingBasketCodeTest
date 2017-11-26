package com.example.alex.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Alex on 25/11/2017.
 */

public class TestCustomer {

    Item item1;
    Item item2;
    Item item3;
    Customer customer1;
    Customer customer2;

    @Before
    public void before(){
        item1 = new Item("Cake", 600);
        item2 = new Item("Cereal", 350);
        item3 = new Item("Bananas", 250);
        customer1 = new Customer(true);
        customer2 = new Customer(false);

    }

    @Test
    public void testBasketStartsEmpty(){
        assertEquals(0, customer1.getBasket().size());
    }

    @Test
    public void testAddItemtoBasket(){
        customer1.addItem(item2);
        customer1.addItem(item1);
        assertEquals(2, customer1.getBasket().size());
    }

    @Test
    public void testRemoveItem(){
        customer1.addItem(item1);
        customer1.addItem(item2);
        customer1.addItem(item3);
        customer1.removeItem(item3);
        assertEquals(2, customer1.getBasket().size());;
    }

    @Test
    public void testClearBasket(){
        customer1.addItem(item1);
        customer1.addItem(item2);
        customer1.addItem(item3);
        customer1.empty();
        assertEquals(0, customer1.getBasket().size());
    }

    @Test
    public void testCustomerHasLoyaltyCard(){
        assertEquals(true, customer1.getLoyaltyCard());
    }

    @Test
    public void testCustomerHasNoLoyaltyCard(){
        assertEquals(false, customer2.getLoyaltyCard());
    }

}
