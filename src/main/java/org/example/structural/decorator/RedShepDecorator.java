package org.example.structural.decorator;

public class RedShepDecorator extends ShepDecorator{
    public RedShepDecorator(Shape decoratorShape){
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedShep(decoratorShape);
    }

    private void setRedShep(Shape redShep){
        System.out.println("Set Redsheap !");
    }
}
