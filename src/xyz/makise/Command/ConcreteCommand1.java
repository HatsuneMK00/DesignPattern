package xyz.makise.Command;

public class ConcreteCommand1 extends Command {
//    �������ͨ�����캯����Ĭ�ϵ�Receiver�������ʵ����Client�ϲ�����ȫ����
//    ���߲���ȫ���� �ɸ߲�����߰���Ҫ��Receiver������Ҳ��
    @Override
    void execute() {
        super.concreteReceiver1.doSomething();
        super.concreteReceiver2.doSomething();
    }
}
