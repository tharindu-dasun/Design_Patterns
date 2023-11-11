package org.example.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

        private final List<Observer> observers = new ArrayList<>();
        private int state;

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
            notifyToAllObserver();
        }

        public void attach(Observer observer){
            observers.add(observer);
        }

        public void notifyToAllObserver(){
            for (Observer observer:observers) {
                observer.update();
        }
    }
}