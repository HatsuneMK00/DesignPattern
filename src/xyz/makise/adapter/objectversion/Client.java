package xyz.makise.adapter.objectversion;

class Client {
    public static void main(String[] args) {
//        ԭ����ҵ���߼�
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();
//        �µ�ҵ���߼� ͨ����������������ʵ����
//        ��Щ�µ�ʵ����϶���֪���� ����ֱ��ʹ�����ǻᵼ����Ŀԭ�д���Ĵ���� ����ʹ��������ģʽ
        Target adapter = new Adapter(new ConcreteOrigin1(),new ConcreteOrigin2(),new ConcreteOrigin3());
        adapter.request();
    }
}
