package xyz.makise.decorator;

//�����������ʱ�������ʲô��ֵ
//�о�Ψһ�ļ�ֵ�����������඼�е�component ��ȡ�ظ�����
abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    abstract void decoratorMethod();

    @Override
    public void operate() {
//        �����˳�����ͨ����������ķ����趨 Ҳ������ʵ����ָ��
        this.component.operate();
    }
}
