package xyz.makise.factorymethod.standard;

public class ConcreteFactory extends Factory {

    @Override
//    这边也可以选择传一个指示字符串 起相同的效果（指定工厂类使用哪一个Product的实现类进行生产）
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try{
//            通过反射机制创建对象
            product = (Product) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) product;
    }
}
