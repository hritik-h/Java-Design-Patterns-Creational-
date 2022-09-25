import DesignPatterns.Factory;
import DesignPatterns.Prototype;
import DesignPatterns.Singleton;
import DesignPatterns.prototypeItems.Sheep;
import child.Biryani;
import parent.Food;

public class Main {
    public static void main(String []args){

        /***
         * Singleton Test
         */
        //System.out.println(Singleton.getInstance());
        //System.out.println(Singleton.getInstance());
        //System.out.println(Singleton.getInstance());
        //System.out.println(Singleton.getInstance());

        /**
         * Factory test
         */

        //Factory factory = new Factory();
        //factory.make("chi").makeFood();

        /**
         * Prototype Testing
         */

        Prototype prototype = new Prototype();
        Sheep bheend = new Sheep();
        Sheep clonedSheep = (Sheep) prototype.getClone(bheend);
    }
}
