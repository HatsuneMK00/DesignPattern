package xyz.makise.command;

abstract class Command {
//    ���ֱ���ڻ������������о����Receiver�ִࣨ�����ࣩ
//    ���Կ������������໹������������
//    �о����������������һЩ ��Ϊ�����Receiver�඼�����µ�û��ʲô����
//    ���Ǿ�������Զ�һЩ���Է��� ��Ȼ��������Լ���Ƿ���Ҳ��װ������
//    Command�������N��ʵ���� Ҳ�����ģʽ��ȱ��֮һ ������Command����ܻ����͵ĺܴ� ÿһ��ָ���װΪ��һ����
//    Ϊ���Ǳ��������ַ������� Ҳ������չ
    ConcreteReceiver1 concreteReceiver1 = new ConcreteReceiver1();
    ConcreteReceiver2 concreteReceiver2 = new ConcreteReceiver2();
    abstract void execute();
}
