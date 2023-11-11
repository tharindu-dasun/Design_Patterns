package org.example.creational.singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }
    public static Singleton getSingleton(){
        return singleton;
    }
    public  void showMassage(){
        System.out.println("Singleton explain");
    }
}
