package org.example.structural.facade;

public class ShapeMaker {
    private Shape circle;
    private Shape rectrangle;
    private Shape squre;

    public ShapeMaker(){
        circle = new Circle();
        rectrangle = new Rectrangle();
        squre = new Squre();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectrangle(){
        rectrangle.draw();
    }
    public void drawSqure(){
        squre.draw();
    }
}
