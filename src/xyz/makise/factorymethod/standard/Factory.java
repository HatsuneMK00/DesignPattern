package xyz.makise.factorymethod.standard;

public abstract class Factory {
//    ��factory��ȡ��һ��������
    public abstract <T extends Product> T createProduct(Class<T> c);
}
