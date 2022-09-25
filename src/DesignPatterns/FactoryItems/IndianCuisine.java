package DesignPatterns.FactoryItems;

import interfaces.CanteenInterface;

public class IndianCuisine implements CanteenInterface {
    @Override
    public void makeFood() {
        System.out.println("Butter Chicken");
    }
}
