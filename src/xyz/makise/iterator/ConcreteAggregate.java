package xyz.makise.iterator;

import java.util.Iterator;
import java.util.Vector;

public class ConcreteAggregate implements Iterable {
//    �����Զ��������������ڴ��Ԫ�ص�����
//    ������ĳ��ָʾ����Ԫ�ص�ֵ ������Բ�����OOAD����������Ŀ��ʹ�õĵ�����ģʽ
//    ������ΪyieldҲ��һ�ֵ�����ģʽ�ı���
//    ����ģʽ�¾������������治��һ��jdk����
    private Vector vector = new Vector();
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }

    public void add(Object object){
        vector.add(object);
    }
}
