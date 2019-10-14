package xyz.makise.decorator;

//当需要被装饰的类有子类的时候 装饰类也可以很好的工作
//并且装饰类可以很好的装饰子类
public class ConcreteComponentSon extends ConcreteComponent {
    @Override
    public void operate() {
        System.out.println("son doing something");
    }
}
