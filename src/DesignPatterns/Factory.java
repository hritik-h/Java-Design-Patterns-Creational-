package DesignPatterns;

import DesignPatterns.FactoryItems.ChineseCuisine;
import DesignPatterns.FactoryItems.IndianCuisine;
import DesignPatterns.FactoryItems.ItalianCuisine;
import interfaces.CanteenInterface;

/**
 * Canteen
 */
public class Factory {
    public CanteenInterface make(String order){

        switch (order){
            case "indian":
                return new IndianCuisine();
            case "chinese":
                return new ChineseCuisine();
            case "italian":
                return new ItalianCuisine();
            default:
                throw new IllegalArgumentException("No such canteen Available");
        }

    }
}
