package DesignPatterns.FactoryItems;

import interfaces.CanteenInterface;

public class ChineseCuisine implements CanteenInterface {
    public void makeFood(){
        System.out.println("Chow mein");
    }
}
