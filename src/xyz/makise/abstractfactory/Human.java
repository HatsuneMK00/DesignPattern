package xyz.makise.abstractfactory;

//这里使用一种更容易理解的方式来写抽象工厂类
//这个像是工厂方法模式的升级版
//和工厂方法模式有什么区别呢 他们的通用类图基本是一样的
//一个接口 多个抽象类 n个实现类
public interface Human {
    void getSex();
    void getColor();
    void talk();
}
