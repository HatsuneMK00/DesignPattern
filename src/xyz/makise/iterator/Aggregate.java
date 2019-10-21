package xyz.makise.iterator;

import java.util.Iterator;

//这个抽象的容器类也只写作参考 具体的容器类实现的是jdk中的Iterable接口
public interface Aggregate {
    void add(Object object);
    void remove(Object object);
//    这边Iterator是要求泛型的 但是不指定的话会发生什么？
    Iterator iterator();
}
