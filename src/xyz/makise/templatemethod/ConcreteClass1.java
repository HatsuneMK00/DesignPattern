package xyz.makise.templatemethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doA() {
        System.out.println("ConcreteClass 1 doing A");
    }

    @Override
    protected void doB() {
        System.out.println("ConcreteClass 1 doing B");
    }

    @Override
    protected void doC() {
        System.out.println("ConcreteClass 1 doing C");
    }

    @Override
    protected void doD() {
        System.out.println("ConcreteClass 1 doing D");
    }

//    ����ʵ�ָù��ӷ����Ϳ��Դﵽ����Ӱ�츸���Ч��
//    ����Ļ���������ʵ��Ҳ��һ����
    @Override
    protected boolean isSomeStatus() {
        return false;
    }
}
