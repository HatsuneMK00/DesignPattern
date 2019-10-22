package xyz.makise.observer;

//这个接口在jdk中也已经有定义了 这边只给出参考实现，在实现具体观察者类和被观察者类时使用jdk中的接口
interface Observer {
//    用于接收数据
    void update(String context);
}
