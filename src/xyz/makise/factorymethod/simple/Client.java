package xyz.makise.factorymethod.simple;

public class Client {
    public static void main(String[] args) {
        //    ����ӿڱ�̵�����
        //    ��������ԭ�������

//        ���������ʹ���˾����Ʒ�� ����������ͼ��ʱ��Ҳ�����ɴ�Client�������Ʒ�������
        Product product = ConcreteFactory.createProduct(ConcreteProduct.class);
//        ���ò�Ʒ��ҵ���߼�����д���Ǹ���
        product.method2();
    }
}
