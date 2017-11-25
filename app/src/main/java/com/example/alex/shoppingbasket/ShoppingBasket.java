package com.example.alex.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by Alex on 25/11/2017.
 */

public class ShoppingBasket {

    private ArrayList<Item> container;
    private Integer totalCost;

    public ShoppingBasket(){
        container = new ArrayList<Item>();
        totalCost = 0;
    }

    public ArrayList<Item> getContainer() {
        return container;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void addItem(Item item){
        container.add(item);
        totalCost += item.getValue();
    }

    public void removeItem(Item item){
        container.remove(item);
        totalCost -= item.getValue();
    }

    public void empty(){
        container.clear();
        totalCost = 0;
    }

}
