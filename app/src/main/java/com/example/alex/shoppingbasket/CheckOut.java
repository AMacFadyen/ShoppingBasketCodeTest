package com.example.alex.shoppingbasket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static android.media.CamcorderProfile.get;

/**
 * Created by Alex on 26/11/2017.
 */



public class CheckOut {

    private Integer calcCost;
    private ArrayList boughtItems;

    public CheckOut(){
        ArrayList boughtItems = new ArrayList<Item>();
    }

    public Boolean hasLoyaltyCard(Customer customer){
        return customer.getLoyaltyCard();
    }

    public Integer getCost(Customer customer){
        calcCost = 0;
            for (int i = 0; i< customer.getBasket().size(); i++){
                calcCost += customer.getBasket().get(i).getValue();
            }
            adjustBuyOneGetOneFree(customer);
            //below two lines adjust totals over £20 by reducing cost by 10%
            if (calcCost > 2000){
                calcCost = (calcCost - ((calcCost/100)*10));
            }
            //Loyalty discount method below adjusts the calcCost by 2% if customer discount boolean returns true
            getLoyaltyDiscount(customer);
            return calcCost;
    }

    public void getLoyaltyDiscount(Customer customer){
        if(hasLoyaltyCard(customer)){
            calcCost =(calcCost - ((calcCost/100)*2));
        }
    }


    public void adjustBuyOneGetOneFree(Customer customer){
        for(int i = 0; i < customer.getBasket().size(); i++){
           int frequency = Collections.frequency(customer.getBasket(), customer.getBasket().get(i));
            if (frequency % 2 == 0){
                calcCost = calcCost - customer.getBasket().get(i).getValue();
            }
            customer.getBasket().remove(i);
            i--;
        }
    }
}






