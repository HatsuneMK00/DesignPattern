package xyz.makise.factorymethod.multifactory;

//�����Ʒ��1�ľ��幤����
public class ConcreteFactory1 extends Factory {
    @Override
    Product createProduct() {
        return new ConcreteProduct1();
    }
}
