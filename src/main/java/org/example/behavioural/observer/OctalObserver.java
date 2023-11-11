package org.example.behavioural.observer;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal Value" + Integer.toBinaryString(subject.getState()));
    }
}
