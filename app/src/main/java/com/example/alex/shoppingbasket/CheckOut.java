package com.example.alex.shoppingbasket;

/**
 * Created by Alex on 26/11/2017.
 */

public class CheckOut {

    private Integer calcCost;

    public CheckOut(){
    }

    public Boolean hasLoyaltyCard(Customer customer){
        return customer.getLoyaltyCard();
    }

    public Integer getCost(Customer customer){
        calcCost = 0;
            for (int i = 0; i< customer.getBasket().size(); i++){
                calcCost += customer.getBasket().get(i).getValue();
            }
            //below two lines adjust totals over £20 by reducing cost by 10%
            if (calcCost > 2000){
                calcCost = (calcCost - ((calcCost/100)*10));
            }
            //Loyalty discount adjusts the calcCost by 2% if customer discount boolean returns true
            getLoyaltyDiscount(customer);
            return calcCost;
    }

    public void getLoyaltyDiscount(Customer customer){
        if(hasLoyaltyCard(customer)){
            calcCost =(calcCost - ((calcCost/100)*2));
        }
    }


//    public void adjustBuyOneGetOneFree(Customer customer){
//        String comparedItem = customer.getBasket().get(0).getName();
//        for()
//    }
}






