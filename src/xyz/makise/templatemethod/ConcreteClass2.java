package xyz.makise.templatemethod;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doA() {
        System.out.println("ConcreteClass 2 doing A");
    }

    @Override
    protected void doB() {
        System.out.println("ConcreteClass 2 doing B");
    }

    @Override
    protected void doC() {
        System.out.println("ConcreteClass 2 doing C");
    }

    @Override
    protected void doD() {
        System.out.println("ConcreteClass 2 doing D");
    }
}
