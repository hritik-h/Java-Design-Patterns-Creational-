package DesignPatterns;

public class Singleton {

    public static Singleton singleton_instance = null;
    private Singleton(){
        System.out.println("Inside Singleton Object");
    }

    public  static Singleton getInstance(){
        if (singleton_instance == null) singleton_instance = new Singleton();
        return singleton_instance;
    }
}
