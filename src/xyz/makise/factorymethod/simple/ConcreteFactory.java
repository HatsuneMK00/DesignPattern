package xyz.makise.factorymethod.simple;

//简单工厂模式中 不对Factory提取抽象工厂类 使代码更简洁 但会使扩展变难
public class ConcreteFactory {
//    将生产函数声明为静态的 不需要实例化factory对象就能使用
//    注意这里生产函数的返回值 返回的是Product具体的类 why？
//    接收的时候都是拿接口类接收的 直接返回Product不行吗
    public static <T extends Product> T createProduct(Class<T> c){
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
