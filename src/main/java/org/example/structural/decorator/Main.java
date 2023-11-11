package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redShepCircle = new RedShepDecorator(new Circle());
        Shape redShapeRectangle = new RedShepDecorator(new Rectangle());

        System.out.println("Without decorator");
        circle.draw();
        System.out.println("\nwith redshape decorator");
        redShepCircle.draw();
        System.out.println("\nwith redshape decorator");
        redShapeRectangle.draw();
    }
}
