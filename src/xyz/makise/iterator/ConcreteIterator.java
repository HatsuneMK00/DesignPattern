package xyz.makise.iterator;

import java.util.Iterator;
import java.util.Vector;

public class ConcreteIterator implements Iterator {
    //    这边感觉不需要自己new 等着传进来就行
    private Vector vector;
    //    用于指向容器的游标
    private int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

//    这个函数做的事情和名字并不是特别符合
//    但是不会出什么错
//    更正 这样的写法才更加适合于编码
    @Override
    public boolean hasNext() {
        return !(cursor == vector.size());
    }

    @Override
    public Object next() {
        Object result;
        if (this.hasNext()) {
            result = vector.get(cursor++);
        } else {
            result = null;
        }
        return result;
    }

//    按照书上所说 这个函数需要完成的是删除当前元素和使游标指向下一个元素
//    当删除的是最后一个元素的时候 没有下一个元素了
//    因此删除和hasNext需要同时调用 和next函数的调用方法是一样的
//    符合逻辑
    @Override
    public void remove() {
        this.vector.remove(cursor);
    }
}
