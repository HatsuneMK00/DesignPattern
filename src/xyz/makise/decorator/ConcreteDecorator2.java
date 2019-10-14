package xyz.makise.decorator;

class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    void decoratorMethod() {
        System.out.println("decorator 2 doing something");
    }

    @Override
    public void operate() {
//        ��ߵ����˸����operate���� ����������д��operate����ֻ��һ�� ���ǵ���component��operate()
//        �����ʹ�ó����Decorator��Ļ� ���дcomponent.operate()��һ����
//        ��ô�ɲ��������е�ʵ���඼ֱ��ʵ����ײ�ĳ���ӿ� ����������װ����
        super.operate();
        this.decoratorMethod();
    }
}
