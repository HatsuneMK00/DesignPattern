package xyz.makise.observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver2 implements Observer {
    //    ���������Ҫ����������һ���Ǳ��۲��ߣ�һ���ǵ��ò����������ݴ������DTO��
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer2 know the change of observable and doing something");
    }
}
