package xyz.makise.factorymethod.multifactory;

//具体产品类1的具体工厂类
public class ConcreteFactory2 extends Factory {
    @Override
    Product createProduct() {
        return new ConcreteProduct2();
    }
}
