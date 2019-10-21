package xyz.makise.iterator;

import java.util.Iterator;
import java.util.Vector;

public class ConcreteAggregate implements Iterable {
//    这是自定义容器类中用于存放元素的容器
//    或者是某种指示容器元素的值 具体可以参照在OOAD蚂蚁爬杆项目中使用的迭代器模式
//    个人认为yield也是一种迭代器模式的变形
//    这种模式下具体容器类里面不是一个jdk容器
    private Vector vector = new Vector();
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }

    public void add(Object object){
        vector.add(object);
    }
}
