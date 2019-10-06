package xyz.makise.factorymethod.lazyinitialization;

import java.util.HashMap;
import java.util.Map;

//    工厂缓存生产出来的产品
//    数据库连接池可以使用这种变种的工厂方法模式
class ConcreteFactory {
    static final Map<String,Product>productMap = new HashMap<>();
//    这里需要注意线程安全问题
    synchronized Product createProduct(String type){
        Product product = null;
        if(productMap.containsKey(type)){
            product = productMap.get(type);
        }else {
            if(type.equals("ConcreteProduct1")){
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
            productMap.put(type,product);
        }
        return product;
    }
}
