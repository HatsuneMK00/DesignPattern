package xyz.makise.facade;

//�����������Խ�������Ҫ��¶��ȥ����ϵͳ��������¶��ȥ
//ͬʱҲ�Ǹ߲����ģ���ܸ��ӷ����ʹ����ϵͳ����
class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void doSomethingA(){
        classA.doSomethingA();
    }

    public void doSomethingB(){
        classB.doSomethingB();
    }

    public void doSomethingC(){
        classC.doSomethingC();
    }

//    ������ʽ������˵��������ʹ������������
//    ��Ϊ������������������ϵͳ���� �൱����������������д��ҵ���߼� �����ǲ��еģ������Ͻ� ���Ҿ��ÿ��Կ�����ôʹ�ã�
//    ������Ҫ��һ����װ���װ���ҵ���߼�
    public void doSomethingD(){
        classA.doSomethingA();
        classC.doSomethingC();
    }
}
