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
//        ���˳��������ν�Ŀ��������������� Ҳ���Ժ�����
        Iterator iterator = concreteAggregate.iterator();
//        ����������hasNext�߼��Ÿ����ʺ���д����
//        while (iterator.hasNext()) {
//            String s = (String) iterator.next();
//            System.out.println(s);
//        }

//      ����ɾ��
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.remove();
        iterator.remove();
        System.out.println(iterator.hasNext());
    }
}
