package xyz.makise.decorator;

//����Ҫ��װ�ε����������ʱ�� װ����Ҳ���ԺܺõĹ���
//����װ������Ժܺõ�װ������
public class ConcreteComponentSon extends ConcreteComponent {
    @Override
    public void operate() {
        System.out.println("son doing something");
    }
}
