package xyz.makise.singleton;

public class Singleton {
//    ��ֻ֤��һ������
    private static final Singleton singleton = new Singleton();
//    ˽�л�������
    private Singleton() {
    }
//    ͨ���÷������ʵ��
    public static Singleton getInstance(){
        return singleton;
    }
//    ����������������static�� why?
    public static void doSomething(){

    }

    public void doOtherThing(){

    }
}
