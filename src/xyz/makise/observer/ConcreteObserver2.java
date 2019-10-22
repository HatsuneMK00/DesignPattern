package xyz.makise.observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver2 implements Observer {
    //    这个函数需要两个参数，一个是被观察者，一个是调用参数（即数据传输对象DTO）
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer2 know the change of observable and doing something");
    }
}
