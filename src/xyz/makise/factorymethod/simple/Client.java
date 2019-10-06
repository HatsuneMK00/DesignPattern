package xyz.makise.factorymethod.simple;

public class Client {
    public static void main(String[] args) {
        //    面向接口编程的体现
        //    依赖倒置原则的体现

//        这里参数中使用了具体产品类 导致生成类图的时候也会生成从Client到具体产品类的依赖
        Product product = ConcreteFactory.createProduct(ConcreteProduct.class);
//        调用产品类业务逻辑（覆写的那个）
        product.method2();
    }
}
