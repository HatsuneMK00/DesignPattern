package xyz.makise.iterator;

import java.util.Iterator;

//��������������Ҳֻд���ο� �����������ʵ�ֵ���jdk�е�Iterable�ӿ�
public interface Aggregate {
    void add(Object object);
    void remove(Object object);
//    ���Iterator��Ҫ���͵� ���ǲ�ָ���Ļ��ᷢ��ʲô��
    Iterator iterator();
}
