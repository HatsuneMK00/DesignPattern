package xyz.makise.Command;

public class ConcreteCommand3 extends Command {
//    �������ͨ�����캯����Ĭ�ϵ�Receiver�������ʵ����Client�ϲ�����ȫ����
//    ���߲���ȫ���� �ɸ߲�����߰���Ҫ��Receiver������Ҳ��
    @Override
    void execute() {
        super.concreteReceiver1.doOtherThing();
        super.concreteReceiver2.doOtherThing();
    }
}
