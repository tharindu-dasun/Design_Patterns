package org.example.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("Value is 2");
      //  Subject.setState(2);
        System.out.println("Value is 14");
       // Subject.setState(2);
    }
}
