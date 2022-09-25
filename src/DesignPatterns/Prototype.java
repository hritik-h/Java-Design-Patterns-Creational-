package DesignPatterns;

import interfaces.AnimalPrototype;

public class Prototype {

    public AnimalPrototype getClone(AnimalPrototype animalSample){
        return animalSample.makeCopy();
    }
}
