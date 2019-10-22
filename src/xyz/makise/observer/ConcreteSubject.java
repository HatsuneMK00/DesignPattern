package xyz.makise.observer;

import java.util.Observable;
import java.util.Observer;

//jdk帮我们实现好了Observable里的一些基本函数，我们只需要实现具体的被观察者的业务逻辑即可 十分方便
//这里体现出了模板方法模式的好（应该是）
//这个父类的实现是线程安全的
class ConcreteSubject extends Observable {
//    这里面只要写业务逻辑即可！
    void doSomething(){
        System.out.println("Observable changed!");
//        这里不需要实现空参数的update函数就可以使用这个notify
//        因为这个函数也是使用了有参的notifyObservers()来实现的，传入的args为null
//        由被观察者的具体方法决定是否需要通知所有观察者
//        只有设置了change的才会进行通知 否则不会进行通知
//        可以在不必要的时候不进行更新 提高运行效率
//        注意这个change是一个成员变量 因此是被所有方法共有的 在方法中需要显式的设置这个值来实现开启和关闭通知
        this.setChanged();
//        顺序是插入的顺序倒序
        this.notifyObservers();
    }
}
