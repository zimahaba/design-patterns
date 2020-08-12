package edu.zimahaba.designpatterns.creational.singleton;

public class App {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.equals(s2) && s2.equals(s2));

        s1.print();
        s2.print();
        s3.print();
    }
}
