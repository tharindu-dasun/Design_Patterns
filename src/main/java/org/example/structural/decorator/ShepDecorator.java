package org.example.structural.decorator;

public abstract class ShepDecorator implements Shape{
    protected Shape decoratorShape;

    public ShepDecorator(Shape decoratorShape){
        this.decoratorShape=decoratorShape;
    }

    @Override
    public void draw(){
        decoratorShape.draw();
    }
}
