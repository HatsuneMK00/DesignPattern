package xyz.makise.templatemethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doA() {
        System.out.println("ConcreteClass 1 doing A");
    }

    @Override
    protected void doB() {
        System.out.println("ConcreteClass 1 doing B");
    }

    @Override
    protected void doC() {
        System.out.println("ConcreteClass 1 doing C");
    }

    @Override
    protected void doD() {
        System.out.println("ConcreteClass 1 doing D");
    }

//    子类实现该钩子方法就可以达到子类影响父类的效果
//    上面的基本方法的实现也是一样的
    @Override
    protected boolean isSomeStatus() {
        return false;
    }
}
