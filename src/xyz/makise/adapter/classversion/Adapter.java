package xyz.makise.adapter.classversion;

//这是类适配器的标准写法
//类适配器一个类只能适配一个类 因为没法多重继承
class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.doSomething();
    }
}
