package xyz.makise.decorator;

class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    void decoratorMethod() {
        System.out.println("decorator 2 doing something");
    }

    @Override
    public void operate() {
//        这边调用了父类的operate函数 父类里面重写的operate函数只有一行 就是调用component的operate()
//        如果不使用抽象的Decorator类的话 这边写component.operate()是一样的
//        那么可不可以所有的实现类都直接实现最底层的抽象接口 不引入抽象的装饰类
        super.operate();
        this.decoratorMethod();
    }
}
