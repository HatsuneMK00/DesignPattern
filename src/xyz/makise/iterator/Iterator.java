package xyz.makise.iterator;

//这里可以考虑一下用泛型吗
//这里的接口只写作参考 具体实现类中实现的是jdk里的Iterator接口
public interface Iterator {
    Object next();

    boolean hasNext();
//    从jdk里的实现可以看到 这个方法是可以不实现的
//    jdk中给了默认实现 抛出一个操作不支持的错误
    boolean remove();
}
