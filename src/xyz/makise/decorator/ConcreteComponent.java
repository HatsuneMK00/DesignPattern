package xyz.makise.decorator;

//����Component��ʵ���඼���Ա�װ�� �������ֵ��໹�Ǽ̳���
class ConcreteComponent implements Component{
    @Override
//    �ӿڷ���Ĭ����public
    public void operate() {
        System.out.println("do something");
    }
}
