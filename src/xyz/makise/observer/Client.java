package xyz.makise.observer;

import java.util.Observable;

class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        ConcreteObserver3 concreteObserver3 = new ConcreteObserver3();
        concreteSubject.addObserver(concreteObserver1);
        concreteSubject.addObserver(concreteObserver2);
        concreteSubject.addObserver(concreteObserver3);
        concreteSubject.doSomething();
    }
}
