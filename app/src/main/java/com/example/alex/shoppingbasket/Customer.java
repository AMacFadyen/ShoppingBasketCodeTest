package com.example.alex.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by Alex on 25/11/2017.
 */

public class Customer {

    private ArrayList<Item> basket;
    private Boolean loyaltyCard;

    public Customer(Boolean loyaltyCard){
        basket = new ArrayList<Item>();
        this.loyaltyCard = loyaltyCard;
    }

    public ArrayList<Item> getBasket() {
        return basket;
    }


    public void addItem(Item item){
        basket.add(item);
    }

    public void removeItem(Item item){
        basket.remove(item);
    }

    public void empty(){
        basket.clear();
    }

    public Boolean getLoyaltyCard() {
        return loyaltyCard;
    }

}
