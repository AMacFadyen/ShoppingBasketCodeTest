package com.example.alex.shoppingbasket;

/**
 * Created by Alex on 26/11/2017.
 */

public class CheckOut {

    private Integer initialCost;

    public CheckOut(){
    }

    public Boolean hasLoyaltyCard(Customer customer){
        return customer.getLoyaltyCard();
    }

    public Integer getTotalCost(Customer customer){
        initialCost = 0;
            for (int i = 0; i< customer.getBasket().size(); i++){
                initialCost += customer.getBasket().get(i).getValue();
            }
            return initialCost;
        }
    }







//    public void applyBuy1Get1Free(Item item){
//        for (int i = 0; i<customer.getBasket().size(); i++){
//
//        }
//    }
