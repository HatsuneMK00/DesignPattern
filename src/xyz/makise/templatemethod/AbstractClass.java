package xyz.makise.templatemethod;

//ģ�巽����һ�ָ���������������� ����Ĳ�ͬʵ�ֻ�Ը���ķ������н������Ӱ��
//���Ŀ����ͻ�дһ�������� Ȼ��ʵ�������������
//����Ҫ���ƹ���ʱ ��������ʵ�ֳ����� ���Ǽ̳������� ��д������Ϳ��Դﵽ��չ���ܵ�����
abstract class AbstractClass {
//    ������������Ϊprotected ���ϵ����ط���
    protected abstract void doA();
    protected abstract void doB();
    protected abstract void doC();
    protected abstract void doD();
//    ���ӷ��� ��ģ�巽��ģʽ����Ҫ��һ��
//
//    �������ͨ����д�÷��� ���ò�ͬ�ķ���ֵ ʹģ�巽����ִ�н����ͬ
//    �ʺ�����Ӧ��������չ
    protected boolean isSomeStatus(){
        return true;
    }
//    Ϊ�˱����޸� ���Խ�ģ�巽������Ϊfinal��
    final void templateMethod(){
        doB();
        doA();
        doC();
//        ��������ʱ��ִ��D
        if (isSomeStatus()) {
            doD();
        }
    }
}
