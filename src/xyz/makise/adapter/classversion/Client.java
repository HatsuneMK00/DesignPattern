package xyz.makise.adapter.classversion;

class Client {
    public static void main(String[] args) {
//        ԭ�е�ҵ���߼�
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();
//        ���ڵ�ҵ���߼�
        Target adapter = new Adapter();
        adapter.request();
    }
}
