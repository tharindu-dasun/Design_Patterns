package org.example.behavioural.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}