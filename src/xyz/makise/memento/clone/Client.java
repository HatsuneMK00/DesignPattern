package xyz.makise.memento.clone;

/*
* ���Կ����������ģʽ�൱�ļ� ���еı��ݹ���ȫ������Originatorһ������ʵ��
* ͨ��cloneʵ��
* */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
//        ��������
        originator.createMemento();
//        �ָ�����
        originator.restoreMemento();
    }
}
