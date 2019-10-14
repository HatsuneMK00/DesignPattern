package xyz.makise.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponentSon();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
