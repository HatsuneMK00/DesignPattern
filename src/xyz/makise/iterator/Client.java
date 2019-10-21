package xyz.makise.iterator;

import java.util.Iterator;

class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add("123");
        concreteAggregate.add("234");
        concreteAggregate.add("345");
        concreteAggregate.add("456");
        concreteAggregate.add("567");
//        这个顺序是无所谓的可以先声明迭代器 也可以后声明
        Iterator iterator = concreteAggregate.iterator();
//        现在这样的hasNext逻辑才更加适合于写代码
//        while (iterator.hasNext()) {
//            String s = (String) iterator.next();
//            System.out.println(s);
//        }

//      测试删除
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.remove();
        iterator.remove();
        System.out.println(iterator.hasNext());
    }
}
