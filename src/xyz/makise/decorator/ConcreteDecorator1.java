package xyz.makise.decorator;

class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    void decoratorMethod() {
        System.out.println("decorator 1 doing something");
    }

    @Override
    public void operate() {
        this.decoratorMethod();
//        ��ߵ����˸����operate���� ����������д��operate����ֻ��һ�� ���ǵ���component��operate()
//        �����ʹ�ó����Decorator��Ļ� ���дcomponent.operate()��һ����
//        ��ô�ɲ��������е�ʵ���඼ֱ��ʵ����ײ�ĳ���ӿ� ����������װ����
        super.operate();
    }
}
