package xyz.makise.factorymethod.standard;

public abstract class Factory {
//    将factory提取出一个抽象类
    public abstract <T extends Product> T createProduct(Class<T> c);
}
