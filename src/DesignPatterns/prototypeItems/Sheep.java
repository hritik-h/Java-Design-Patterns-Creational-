package DesignPatterns.prototypeItems;

import interfaces.AnimalPrototype;

public class Sheep implements AnimalPrototype {
    public Sheep() {
        System.out.println("Sheep is made");
    }



    @Override
    public AnimalPrototype makeCopy() {
        System.out.println("Sheep is being cloned");

        Sheep sheepObject = null;

        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return sheepObject;
    }


}
