package xyz.makise.iterator;

import java.util.Iterator;
import java.util.Vector;

public class ConcreteIterator implements Iterator {
    //    ��߸о�����Ҫ�Լ�new ���Ŵ���������
    private Vector vector;
    //    ����ָ���������α�
    private int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

//    �������������������ֲ������ر����
//    ���ǲ����ʲô��
//    ���� ������д���Ÿ����ʺ��ڱ���
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

//    ����������˵ ���������Ҫ��ɵ���ɾ����ǰԪ�غ�ʹ�α�ָ����һ��Ԫ��
//    ��ɾ���������һ��Ԫ�ص�ʱ�� û����һ��Ԫ����
//    ���ɾ����hasNext��Ҫͬʱ���� ��next�����ĵ��÷�����һ����
//    �����߼�
    @Override
    public void remove() {
        this.vector.remove(cursor);
    }
}
