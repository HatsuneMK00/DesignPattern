package xyz.makise.iterator;

//������Կ���һ���÷�����
//����Ľӿ�ֻд���ο� ����ʵ������ʵ�ֵ���jdk���Iterator�ӿ�
public interface Iterator {
    Object next();

    boolean hasNext();
//    ��jdk���ʵ�ֿ��Կ��� ��������ǿ��Բ�ʵ�ֵ�
//    jdk�и���Ĭ��ʵ�� �׳�һ��������֧�ֵĴ���
    boolean remove();
}
