package xyz.makise.factorymethod.standard;

public class Client {
    public static void main(String[] args) {
        //    面向接口编程的体现
        //    依赖倒置原则的体现
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct1.class);
//        调用产品类业务逻辑（覆写的那个）
        product.method2();
    }
}
