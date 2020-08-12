package edu.zimahaba.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void print() {
        System.out.println("Printing...");
    }
}
