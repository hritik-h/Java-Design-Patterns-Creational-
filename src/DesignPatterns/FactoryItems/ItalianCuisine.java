package DesignPatterns.FactoryItems;

import interfaces.CanteenInterface;

public class ItalianCuisine implements CanteenInterface {

    @Override
    public void makeFood() {
        System.out.println("Pizza");
    }
}
