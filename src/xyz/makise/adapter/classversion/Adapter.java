package xyz.makise.adapter.classversion;

//�������������ı�׼д��
//��������һ����ֻ������һ���� ��Ϊû�����ؼ̳�
class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.doSomething();
    }
}
