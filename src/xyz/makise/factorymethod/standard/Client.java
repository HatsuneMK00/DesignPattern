package xyz.makise.factorymethod.standard;

public class Client {
    public static void main(String[] args) {
        //    ����ӿڱ�̵�����
        //    ��������ԭ�������
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct1.class);
//        ���ò�Ʒ��ҵ���߼�����д���Ǹ���
        product.method2();
    }
}
