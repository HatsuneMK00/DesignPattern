package xyz.makise.adapter.classversion;

//���������ԭ����Ŀ��ʹ�õ��߼�
class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("doing old stuff");
    }
}
